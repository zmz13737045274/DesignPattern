package com.delegate.simple;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EmpA implements IEmployee{

    @Override
    public void doing(String command) {
        log.info(" I'm EmpA,be good at encrypt,now execute " + command);
    }
}
