package com.tec.app.s2;

import com.tec.app.B;

public class C1 {
    C obj = new C();
    CfromB objCB = new CfromB();
    void medodoC(){
        //obj.miMetodo(); no visible por que es privado}
        obj.otroMetodo();
    }
}
