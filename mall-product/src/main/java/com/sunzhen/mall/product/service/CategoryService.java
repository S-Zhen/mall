package com.sunzhen.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sunzhen.common.utils.PageUtils;
import com.sunzhen.mall.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author sunzhen
 * @email 1025951770@qq.com
 * @date 2021-01-01 23:38:15
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    /**
    * @Description: 查出所有分类以及子分类，以树形结构组装起来
    * @Param: []
    * @return: java.util.List<com.sunzhen.mall.product.entity.CategoryEntity>
    * @Author: sunzhen
    * @Date: 2021/1/4
    */
    List<CategoryEntity> listWithTree();
}

