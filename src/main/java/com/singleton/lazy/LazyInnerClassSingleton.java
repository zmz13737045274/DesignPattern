package com.singleton.lazy;

public class LazyInnerClassSingleton {

    private LazyInnerClassSingleton() {
        if (lazyHolder.LAZY != null){
            throw new RuntimeException("不允许创建多个实例");
        }
    }


    public static final LazyInnerClassSingleton getInstance() {

        return lazyHolder.LAZY;
    }

    private static class lazyHolder {
        private static final LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();
    }


}
