package com.sunzhen.mall.product.dao;

import com.sunzhen.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author sunzhen
 * @email 1025951770@qq.com
 * @date 2021-01-01 23:38:15
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
