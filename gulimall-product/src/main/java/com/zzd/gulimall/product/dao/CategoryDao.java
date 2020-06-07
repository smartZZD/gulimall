package com.zzd.gulimall.product.dao;

import com.zzd.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author zzd
 * @email zhongzuda@qq.com
 * @date 2020-06-07 19:02:50
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
