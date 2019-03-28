package com.strategy.pay;

import com.strategy.pay.payport.PayStrategy;
import lombok.extern.slf4j.Slf4j;

/**
 * JDK Comparator
 * Spring Resource、InstantiationStrategy、
 */
@Slf4j
public class PayStrategyTest {

    public static void main(String[] args) {
        Order order = new Order("1","20190313",324.45);
        MsgResult result = order.pay(PayStrategy.UNION_PAY);
        log.info(result.toString());


    }

}
