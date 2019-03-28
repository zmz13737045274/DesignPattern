package com.strategy.pay;

import com.strategy.pay.payport.PayStrategy;
import com.strategy.pay.payport.Payment;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@AllArgsConstructor
@Slf4j
public class Order {

    private String uId;
    private String orderId;
    private Double amount;

    public MsgResult pay(String payKey){
        Payment payment = PayStrategy.get(payKey);
        log.info(" 欢迎使用 " + payment.getName());
        log.info(" 本次交易金额为: " + amount + " 开始扣款...");
        return payment.pay(uId,amount);
    }


}
