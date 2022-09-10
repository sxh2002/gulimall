package com.wwh.gulimall.order.dao;

import com.wwh.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author wwh@qq.com
 * @email wwh@gmail.com
 * @date 2022-09-10 14:47:21
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
