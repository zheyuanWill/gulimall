package com.example.gulicoupon.coupon.dao;

import com.example.gulicoupon.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author zheyuanw
 * @email zheyuanwu243@gmail.com
 * @date 2024-02-05 15:35:56
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
