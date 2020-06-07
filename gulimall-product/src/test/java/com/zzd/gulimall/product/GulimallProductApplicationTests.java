package com.zzd.gulimall.product;

import com.zzd.gulimall.product.dao.AttrDao;
import com.zzd.gulimall.product.entity.AttrEntity;
import com.zzd.gulimall.product.service.AttrService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest(classes = ProductApplication.class)
class GulimallProductApplicationTests {

    @Autowired
    private AttrDao attrDao;

    @Autowired
    private AttrService attrService;
    @Test
    void contextLoads() {
        AttrEntity attrEntity = attrDao.selectById(1);
        System.out.println(attrEntity);
    }

    @Test
    void test1() {
        List<AttrEntity> list = attrService.list();
        AttrEntity entity = list.get(0);
        System.out.println(entity);
    }

}
