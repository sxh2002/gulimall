package com.wwh.gulimall.member.dao;

import com.wwh.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author wwh@qq.com
 * @email wwh@gmail.com
 * @date 2022-09-10 14:40:25
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
