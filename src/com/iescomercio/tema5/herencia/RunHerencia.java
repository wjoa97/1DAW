package com.iescomercio.tema5.herencia;

/**
 *
 * 
 */
public class RunHerencia {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        A a2 = new C();
        
        b.m1();
        c.m2(); // B's m1, A's m2, A's m3,
        a.m3();
        System.out.println("");
        c.m1();
        c.m2(); // B's m1, A's m2, C's m3, 13
        c.m3();
        System.out.println("");
        a.m1();
        b.m2(); // A's m1, A's m2, C's m3, 13
        c.m3();
        System.out.println("");
        a2.m1();
        a2.m2(); // B's m1, A's m2, C's m3, 13
        a2.m3();
    }
}
