package com.sunzhen.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sunzhen.common.utils.PageUtils;
import com.sunzhen.mall.coupon.entity.MemberPriceEntity;

import java.util.Map;

/**
 * 商品会员价格
 *
 * @author sunzhen
 * @email 1025951770@qq.com
 * @date 2021-01-02 00:22:37
 */
public interface MemberPriceService extends IService<MemberPriceEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

