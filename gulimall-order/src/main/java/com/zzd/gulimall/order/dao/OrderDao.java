package com.zzd.gulimall.order.dao;

import com.zzd.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author zzd
 * @email zhongzuda@qq.com
 * @date 2020-06-07 19:38:39
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
