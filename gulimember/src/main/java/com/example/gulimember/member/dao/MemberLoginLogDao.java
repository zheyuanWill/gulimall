package com.example.gulimember.member.dao;

import com.example.gulimember.member.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author zheyuanw
 * @email zheyuanwu243@gmail.com
 * @date 2024-02-05 15:42:23
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {
	
}
