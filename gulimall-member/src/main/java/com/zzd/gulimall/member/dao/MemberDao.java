package com.zzd.gulimall.member.dao;

import com.zzd.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author zzd
 * @email zhongzuda@qq.com
 * @date 2020-06-07 19:40:16
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
