package com.sunzhen.mall.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sunzhen.common.utils.PageUtils;
import com.sunzhen.common.utils.Query;

import com.sunzhen.mall.product.dao.CategoryDao;
import com.sunzhen.mall.product.entity.CategoryEntity;
import com.sunzhen.mall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    /**
    * @Description: 查出所有分类以及子分类，以树形结构组装起来
    * @Param: []
    * @return: java.util.List<com.sunzhen.mall.product.entity.CategoryEntity>
    * @Author: sunzhen
    * @Date: 2021/1/4
    */
    @Override
    public List<CategoryEntity> listWithTree() {
        //1、查出所有分类
        List<CategoryEntity> entities = baseMapper.selectList(null);

        //2、组装成父子的树形结构
        //2.1）、找到所有的一级分类
        List<CategoryEntity> level1Menus = entities.stream().filter(categoryEntity ->
                categoryEntity.getParentCid() == 0
        ).map((menu) -> {
            menu.setChildren(getChildrens(menu, entities));
            return menu;
        }).sorted(Comparator.comparingInt(menu -> (menu.getSort() == null ? 0 : menu.getSort()))).collect(Collectors.toList());


        return level1Menus;
    }

    /**
    * @Description: 递归查找所有菜单的子菜单
    * @Param: [root, all]
    * @return: java.util.List<com.sunzhen.mall.product.entity.CategoryEntity>
    * @Author: sunzhen
    * @Date: 2021/1/4
    */
    private List<CategoryEntity> getChildrens(CategoryEntity root, List<CategoryEntity> all) {

        List<CategoryEntity> children = all.stream().filter(categoryEntity ->
            categoryEntity.getParentCid() == root.getCatId()
        ).map(categoryEntity -> {
            //1、找到子菜单
            categoryEntity.setChildren(getChildrens(categoryEntity, all));
            return categoryEntity;
        }).sorted(Comparator.comparingInt(menu -> (menu.getSort() == null ? 0 : menu.getSort()))).collect(Collectors.toList());

        return children;
    }

}