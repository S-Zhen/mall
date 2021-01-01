package com.sunzhen.mall.order.dao;

import com.sunzhen.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author sunzhen
 * @email 1025951770@qq.com
 * @date 2021-01-02 00:42:29
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
