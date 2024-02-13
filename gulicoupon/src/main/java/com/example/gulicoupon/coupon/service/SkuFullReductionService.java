package com.example.gulicoupon.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.to.SkuReductionTo;
import com.example.common.utils.PageUtils;
import com.example.gulicoupon.coupon.entity.SkuFullReductionEntity;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author zheyuanw
 * @email zheyuanwu243@gmail.com
 * @date 2024-02-05 15:35:56
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveSkuReduction(SkuReductionTo skuReductionTo);
}

