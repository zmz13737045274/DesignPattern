package com.singleton.serializable;


import java.io.Serializable;

public class SerializableSingleton implements Serializable{

    private SerializableSingleton(){};

    private static final SerializableSingleton INSTANCE = new SerializableSingleton();

    public static SerializableSingleton getInstance(){
        return INSTANCE;
    }

    private Object readResolve(){
        return INSTANCE;
    }


}
