package com.tec.app;

import com.tec.app.s2.C;

public class B {
    C obj = new C();
    protected  void metodoB(){
        //obj.miMetodo(); es privado
        System.out.println("Este es mi metodo B");
    }
}
