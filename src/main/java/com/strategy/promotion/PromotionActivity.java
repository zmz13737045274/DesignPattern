package com.strategy.promotion;

public class PromotionActivity {

    private PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy strategy) {
        this.promotionStrategy = strategy;
    }

    public void execution(){
        this.promotionStrategy.doPromotion();
    }
}
