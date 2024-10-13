// Multilevel Inheritance

class A {
    int number;
    String name;

}

class B extends A{

}

class C extends B {

}

public class MultiLevel {
    public static void main(String[] args) {

        A a1 = new A();
        a1.name = "Abc";
        System.out.println(a1.name);

        C c1 = new C();
        c1.name = "Xyz";
        System.out.println(c1.name);
        
    }
    
}
