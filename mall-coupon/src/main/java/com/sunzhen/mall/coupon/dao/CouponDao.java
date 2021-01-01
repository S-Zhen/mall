package com.sunzhen.mall.coupon.dao;

import com.sunzhen.mall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author sunzhen
 * @email 1025951770@qq.com
 * @date 2021-01-02 00:22:39
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
