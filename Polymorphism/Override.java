package Polymorphism;

class Baseclass {
    public void method() { // Base class method
        System.out.println("I'm the method of BaseClass");
    }
    public void method1() { // Base class method
        System.out.println("I'm the method 1 of BaseClass");
    }
}
class DerivedClass extends Baseclass {
    public void method() {// Base class method
        System.out.println("I'm the method of DerivedClass");
    }
}

public class Override {
    public static void main(String[] args) {
// method calling from sub class object
        DerivedClass der = new DerivedClass();
        der.method();
// method calling from super class object
        Baseclass base = new Baseclass();
        base.method();
        Baseclass base1 = new DerivedClass();
        base1.method();
        base1.method1();
    }

}
