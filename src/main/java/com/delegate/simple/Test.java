package com.delegate.simple;

public class Test {

    public static void main(String[] args) {
        new Boss().command("encrypt",new Leader());
    }
}
