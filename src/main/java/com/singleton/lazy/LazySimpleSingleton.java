package com.singleton.lazy;

public class LazySimpleSingleton {

    private LazySimpleSingleton() {
    }


    private static LazySimpleSingleton lazy = null;


    public static synchronized LazySimpleSingleton getInstance() {
        if (lazy == null){
            lazy = new LazySimpleSingleton();

        }
        return lazy;
    }


}
