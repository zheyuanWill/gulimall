package com.example.guliproduct.product.dao;

import com.example.guliproduct.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author zheyuanw
 * @email zheyuanwu243@gmail.com
 * @date 2024-02-05 11:56:35
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
