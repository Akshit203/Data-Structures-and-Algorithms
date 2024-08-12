package ArrayList;
import java.util.*;
import java.util.Scanner;

public class list {
    public static void main(String[] args) {

        ArrayList <Integer> list1 = new ArrayList<>();

        list1.add(10);
        list1.add(20);

        System.out.println(list1);

        list1.add(0, 45);
        System.out.println(list1);

        list1.add(10, 45);
        System.out.println(list1);
        
    }
}

