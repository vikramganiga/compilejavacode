package com.core.prime.subpkg;

import com.core.prime.TestPublic;

public class TestProtected extends TestPublic {

    TestPublic testPublic = new TestPublic();

    public void getMessage(){
        getHello();
        
    }
}