package com.zzd.gulimall.product.controller;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zzd.gulimall.product.entity.SpuInfoDescEntity;
import com.zzd.gulimall.product.service.SpuInfoDescService;



/**
 * spu信息介绍
 *
 * @author zzd
 * @email zhongzuda@qq.com
 * @date 2020-06-07 19:02:50
 */
@RestController
@RequestMapping("product/spuinfodesc")
public class SpuInfoDescController {
    @Autowired
    private SpuInfoDescService spuInfoDescService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public String list(@RequestParam Map<String, Object> params){


         return "ok";
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{spuId}")
    public String info(@PathVariable("spuId") Long spuId){


        return "ok";
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public String save(@RequestBody SpuInfoDescEntity spuInfoDesc){


        return "ok";
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public String update(@RequestBody SpuInfoDescEntity spuInfoDesc){


        return "ok";
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public String delete(@RequestBody Long[] spuIds){

        return "ok";
    }

}
