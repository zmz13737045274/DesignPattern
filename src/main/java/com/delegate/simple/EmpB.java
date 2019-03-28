package com.delegate.simple;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EmpB implements IEmployee{

    @Override
    public void doing(String command) {
        log.info(" I'm EmpB,be good at architecture,now execute " + command);
    }
}
