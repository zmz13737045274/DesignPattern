package com.singleton.lazy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LazySimpleSingletonTest {

    public static void main(String[] args) {


        Thread th1 = new Thread(new ExectorThread());
        Thread th2 = new Thread(new ExectorThread());

        th1.start();
        th2.start();

        log.info(" End ");

    }
}
