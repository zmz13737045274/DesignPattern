package com.singleton.lazy;

import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;
import java.lang.reflect.Constructor;

@Slf4j
public class LazyInnerClassSingletonTest {

    public static void main(String[] args) throws Exception {
        Class<?> clazz = LazyInnerClassSingleton.class;
        Constructor c = clazz.getDeclaredConstructor(null);
        c.setAccessible(true);
        Object o1 = c.newInstance();

        Object o2 = LazyInnerClassSingleton.getInstance();

        log.info(String.valueOf(o1 == o2));



    }
}
