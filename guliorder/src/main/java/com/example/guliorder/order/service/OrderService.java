package com.example.guliorder.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.to.mq.SeckillOrderTo;
import com.example.common.utils.PageUtils;
import com.example.guliorder.order.entity.OrderEntity;
import com.example.guliorder.order.vo.*;

import java.util.Map;
import java.util.concurrent.ExecutionException;

/**
 * 订单
 *
 * @author zheyuanw
 * @email zheyuanwu243@gmail.com
 * @date 2024-02-05 15:51:33
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
    /**
     * 订单确认页返回需要用的数据
     * @return
     */
    OrderConfirmVo confirmOrder() throws ExecutionException, InterruptedException;

    /**
     * 创建订单
     * @param vo
     * @return
     */
    SubmitOrderResponseVo submitOrder(OrderSubmitVo vo);

    /**
     * 按照订单号获取订单信息
     * @param orderSn
     * @return
     */
    OrderEntity getOrderByOrderSn(String orderSn);

    /**
     * 关闭订单
     * @param orderEntity
     */
    void closeOrder(OrderEntity orderEntity);

    /**
     * 获取当前订单的支付信息
     * @param orderSn
     * @return
     */
    PayVo getOrderPay(String orderSn);

    /**
     * 查询当前用户所有订单数据
     * @param params
     * @return
     */
    PageUtils queryPageWithItem(Map<String, Object> params);

    /**
     *支付宝异步通知处理订单数据
     * @param asyncVo
     * @return
     */
    String handlePayResult(PayAsyncVo asyncVo);

    /**
     * 微信异步通知处理
     * @param notifyData
     */
    String asyncNotify(String notifyData);


    /**
     * 创建秒杀单
     * @param orderTo
     */
    void createSeckillOrder(SeckillOrderTo orderTo);
}

