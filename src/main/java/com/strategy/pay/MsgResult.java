package com.strategy.pay;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class MsgResult {

    private int code;
    private Object data;
    private String msg;
}
