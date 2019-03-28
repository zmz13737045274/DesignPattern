package com.strategy.pay.payport;

import java.util.HashMap;
import java.util.Map;

public class PayStrategy {

    public static final String ALI_PAY = "Alipay";
    public static final String JD_PAY = "Jdpay";
    public static final String WECHAT_PAY = "Wechatpay";
    public static final String UNION_PAY = "Unionpay";

    public static final String DEFAULT_PAY = "Alipay";

    private static Map<String,Payment> payStrategy = new HashMap<>();

    static {
        payStrategy.put(ALI_PAY,new AliPay());

        payStrategy.put(JD_PAY,new JDPay());
        payStrategy.put(UNION_PAY,new UnionPay());
        payStrategy.put(WECHAT_PAY,new WechatPay());
    }

    public static Payment get(String payKey){

        if (!payStrategy.containsKey(payKey)){
            return payStrategy.get(ALI_PAY);
        }

        return payStrategy.get(payKey);

    }

}
