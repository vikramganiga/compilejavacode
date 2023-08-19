package com.core.designpattern.adapterpattern;

public class Socket {

    public Volt getVolt(){
        return new Volt(120);
    }
    
}
