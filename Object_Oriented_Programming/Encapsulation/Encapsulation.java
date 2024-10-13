package Encapsulation;
class Student {

    private String name;
    private int age;
    private String city;

    public String get_name (){
        return name;
    }

    public int get_age (){
        return age;
    }

    public String get_city (){
        return city;
    }

    public void set_name(String name){
        this.name = name;
    }

    public void set_age(int age){
        this.age = age;
    }

    public void set_city(String city){
        this.city = city;
    }
}


public class Encapsulation {
    public static void main (String[] args){

        Student s1 = new Student();

        s1.set_name("Ak");
        System.out.println(s1.get_name());
        
    }
}
