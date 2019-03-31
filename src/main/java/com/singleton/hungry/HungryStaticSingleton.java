package com.singleton.hungry;

public class HungryStaticSingleton {

    private HungryStaticSingleton(){};

    private static final HungryStaticSingleton HUNGRY_SINGLETON;

    static {
        HUNGRY_SINGLETON = new HungryStaticSingleton();
    }

    public static HungryStaticSingleton getInstance(){
        return HUNGRY_SINGLETON;
    }


}
