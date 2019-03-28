package com.strategy.promotion;

import java.util.HashMap;
import java.util.Map;

public class PromotionActivityFactory {

    //单例
    private PromotionActivityFactory(){};

    //饿汉式单例
    private static Map<String,PromotionStrategy> promotionStrategyMap = new HashMap<>();

    private static final PromotionStrategy NON_PROMOTION_STRATEGY = new EmptyStrategy();

    static {
        promotionStrategyMap.put(PromotionKey.COUPON,new CouponStrategy());
        promotionStrategyMap.put(PromotionKey.CASHBACK,new CashbackStrategy());
        promotionStrategyMap.put(PromotionKey.GROUPBUY,new GroupBuyStrategy());
    }

    //工厂方法
    public static PromotionStrategy getPromotionStrategy(String promotionKey){

        PromotionStrategy strategy = promotionStrategyMap.get(promotionKey);
        if (strategy == null){
            return NON_PROMOTION_STRATEGY;
        }
        return strategy;
    }

    private interface PromotionKey{
        String COUPON = "COUPON";
        String CASHBACK = "CASHBACK";
        String GROUPBUY = "GROUPBUY";

    }
}
