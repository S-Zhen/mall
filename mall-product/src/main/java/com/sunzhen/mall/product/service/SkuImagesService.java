package com.sunzhen.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sunzhen.common.utils.PageUtils;
import com.sunzhen.mall.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author sunzhen
 * @email 1025951770@qq.com
 * @date 2021-01-01 23:38:15
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

