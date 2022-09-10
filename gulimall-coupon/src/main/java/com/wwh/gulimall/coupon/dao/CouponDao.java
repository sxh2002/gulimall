package com.wwh.gulimall.coupon.dao;

import com.wwh.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author wwh@qq.com
 * @email wwh@gmail.com
 * @date 2022-09-10 14:35:20
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
