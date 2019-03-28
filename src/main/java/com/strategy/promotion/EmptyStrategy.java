package com.strategy.promotion;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EmptyStrategy implements PromotionStrategy {

    @Override
    public void doPromotion() {
        log.info(" no benefit ");
    }
}
