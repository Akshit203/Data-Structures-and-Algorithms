import java.util.*;

class Animal {
    String name;
    int height;

}

class Dog extends Animal{
    int age;

}

public class Single {
    public static void main(String[] args) {

        Dog d1 = new Dog();
        d1.name = "Tom";
        System.out.println(d1.name);
        
    }
}
