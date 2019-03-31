package com.singleton.lazy;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ExectorThread implements Runnable {
    public void run() {
        try {
            Thread.sleep(100);
            LazySimpleSingleton singleton = LazySimpleSingleton.getInstance();
            log.info(Thread.currentThread().getName() + ": " + singleton);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
