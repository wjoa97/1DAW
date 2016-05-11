package com.iescomercio.tema05.herencia;

/**
 *
 *
 */
public class C extends B{

    @Override
    public void m3() {
        System.out.println("C's m3, " + (ivar + 6));
    }
}
