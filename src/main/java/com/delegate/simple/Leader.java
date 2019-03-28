package com.delegate.simple;

import java.util.HashMap;
import java.util.Map;

public class Leader {

    private Map<String, IEmployee> register = new HashMap<>();

    public Leader() {
        register.put("encrypt", new EmpA());
        register.put("architecture", new EmpB());
    }

    public void doing(String command) {
        register.get(command).doing(command);

    }
}
