package com.zzd.gulimall.coupon.dao;

import com.zzd.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author zzd
 * @email zhongzuda@qq.com
 * @date 2020-06-07 19:12:49
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
