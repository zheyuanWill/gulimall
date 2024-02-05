package com.example.guliware.ware.dao;

import com.example.guliware.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author zheyuanw
 * @email zheyuanwu243@gmail.com
 * @date 2024-02-05 15:55:18
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
