package com.zzd.gulimall.coupon.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.zzd.gulimall.coupon.dao.CategoryBoundsDao;
import com.zzd.gulimall.coupon.entity.CategoryBoundsEntity;
import com.zzd.gulimall.coupon.service.CategoryBoundsService;


@Service("categoryBoundsService")
public class CategoryBoundsServiceImpl extends ServiceImpl<CategoryBoundsDao, CategoryBoundsEntity> implements CategoryBoundsService {


}