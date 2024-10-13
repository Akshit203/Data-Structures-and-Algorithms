package Constructor;
import java.util.*;

class student {

    int age;
    String name;

    student(){

        // constructor chaining
        this(15, "constructor chaining");

        System.out.println("Default constructor called");

    };

    // parameterized constructor
    // constructor overloading

    student(int age, String name){
        this.age = age;
        this.name = name;

        System.out.println("My age is " +age + "and my name is " + name);
    }


    // Ambiguity would arise if we tried to define another constructor
    // with the same number and type of parameters as the parameterized constructor.
    
    // Constructor overloading requires constructors to have a different number 
    // or type of parameters (the name of parameters doesn't matter).

    /*
    // The following constructor would cause ambiguity and result in a compile-time error
    // because it has the same number and types of parameters (int, String) as the previous constructor.

    student(int height, String city) {
        // This would be ambiguous and thus invalid.
    }
    */
  
}

public class Constructor {
    public static void main(String[] args) {

        student s1 = new student();
        student s2 = new student(10, "ak");
        
    }
    
}
