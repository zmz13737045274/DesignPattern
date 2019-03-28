package com.strategy.promotion;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GroupBuyStrategy implements PromotionStrategy {

    @Override
    public void doPromotion() {
        log.info(" get benefit from groupBuy ");
    }
}
