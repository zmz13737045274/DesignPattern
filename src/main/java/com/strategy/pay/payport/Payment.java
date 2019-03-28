package com.strategy.pay.payport;

import com.strategy.pay.MsgResult;

public abstract class Payment {

    public abstract String getName();

    protected abstract double queryBalance(String uid);

    public MsgResult pay(String uid,double amount){
        if (queryBalance(uid) < amount){
            return new MsgResult(500,"pay fail","balance is not enough");
        }else {

            return new MsgResult(200,"pay success","amount is " + amount);
        }
    }

}
