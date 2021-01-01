package com.sunzhen.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sunzhen.common.utils.PageUtils;
import com.sunzhen.mall.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author sunzhen
 * @email 1025951770@qq.com
 * @date 2021-01-01 23:38:14
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

