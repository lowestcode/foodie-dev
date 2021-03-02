package com.imooc.controller;

import com.imooc.enums.PayMethod;
import com.imooc.pojo.bo.SubmitOrderBO;
import com.imooc.utils.CookieUtils;
import com.imooc.utils.IMOOCJSONResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@Api(value = "订单相关",tags = {"订单相关的api接口"})
@RequestMapping("orders")
@RestController
public class OrderController {

    final static Logger logger = LoggerFactory.getLogger(OrderController.class);

    @ApiOperation(value = "用户下单",notes="用户下单",httpMethod = "POST")
    @PostMapping("/create")
    public IMOOCJSONResult create(@RequestBody SubmitOrderBO submitOrderBO){

        if (submitOrderBO.getPayMethod() != PayMethod.WEIXIN.type && submitOrderBO.getPayMethod() != PayMethod.ALIPAY.type){
            return IMOOCJSONResult.errorMsg("支付方式不支持！");
        }

        logger.info("德玛西亚-----{}----{}",submitOrderBO.toString(),"诺克萨斯");
        // 1.创建订单
        // 2.创建订单以后，一处购物车中已经结算（已提交）的商品
        // 3.向支付中心发送当前订单，用于保存支付中心的订单数据
        return IMOOCJSONResult.ok();
    }
}
