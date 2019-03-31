package com.singleton.hungry;

/**
 * 饿汉式单例：在单例类首次加载时就创建实例
 */
public class HungrySingleton {

    private HungrySingleton(){};

    private static final HungrySingleton HUNGRY_SINGLETON = new HungrySingleton();

    public static HungrySingleton getInstance(){
        return HUNGRY_SINGLETON;
    }


}
