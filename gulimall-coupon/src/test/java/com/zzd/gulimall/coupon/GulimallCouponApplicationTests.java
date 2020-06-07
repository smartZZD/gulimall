package com.zzd.gulimall.coupon;

import com.zzd.gulimall.coupon.dao.CategoryBoundsDao;
import com.zzd.gulimall.coupon.entity.CategoryBoundsEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallCouponApplicationTests {

    @Autowired
    private CategoryBoundsDao categoryBoundsDao;
    @Test
    void contextLoads() {
        CategoryBoundsEntity categoryBoundsEntity = categoryBoundsDao.selectById(1);
        System.out.println(categoryBoundsEntity);
    }

}
