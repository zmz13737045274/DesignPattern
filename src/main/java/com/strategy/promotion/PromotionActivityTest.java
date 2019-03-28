package com.strategy.promotion;

public class PromotionActivityTest {

    public static void main(String[] args) {


    }

    public static void v1() {
        PromotionActivity activity618 = new PromotionActivity(new CouponStrategy());
        PromotionActivity activity1111 = new PromotionActivity(new CashbackStrategy());

        activity618.execution();
        activity1111.execution();
    }

    public static void v2() {
        PromotionActivity activity = null;
        String promotionKey = "coupon";

        if ("coupon".equals(promotionKey)) {
            activity = new PromotionActivity(new CouponStrategy());
        } else if ("cashback".equals(promotionKey)) {
            activity = new PromotionActivity(new CashbackStrategy());
        } else {
            //........
        }

        activity.execution();
    }

    public static void v3(){
        String promotionKey = "GROUPBUY";
        PromotionActivity activity = new PromotionActivity(PromotionActivityFactory.getPromotionStrategy(promotionKey));
        activity.execution();
    }
}
