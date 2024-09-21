package TS127;

public class EntryPoint {
    public static void main(String args[]) {
        B b = new B();
        b.abstractMethod();
        b.concreteMethod();
        C c = new C();
        c.abstractMethod();
        c.concreteMethod();
    }
}
