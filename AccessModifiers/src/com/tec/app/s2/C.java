package com.tec.app.s2;

import com.tec.A;
import com.tec.app.B;

public class C {
    A obj = new A();
    B objB= new B();
     private void miMetodo(){
        System.out.println("Hola");

    }
    public void otroMetodo(){
         this.miMetodo();
    }
}
