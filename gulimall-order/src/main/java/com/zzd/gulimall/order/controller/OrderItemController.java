package com.zzd.gulimall.order.controller;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zzd.gulimall.order.entity.OrderItemEntity;
import com.zzd.gulimall.order.service.OrderItemService;



/**
 * 订单项信息
 *
 * @author zzd
 * @email zhongzuda@qq.com
 * @date 2020-06-07 19:38:39
 */
@RestController
@RequestMapping("order/orderitem")
public class OrderItemController {
    @Autowired
    private OrderItemService orderItemService;

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
    @RequestMapping("/info/{id}")
    public String info(@PathVariable("id") Long id){


        return "ok";
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public String save(@RequestBody OrderItemEntity orderItem){


        return "ok";
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public String update(@RequestBody OrderItemEntity orderItem){


        return "ok";
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public String delete(@RequestBody Long[] ids){

        return "ok";
    }

}
