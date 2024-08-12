package ArrayList;
import java.util.ArrayList;

public class addAll {

    public static void main(String[] args) {
        
        
        ArrayList <Integer> list1 = new ArrayList<>();
        
        list1.add(10);
        list1.add(20);

        System.out.println(list1); // [10, 20]

        ArrayList <Integer> list2 = new ArrayList<>();

        list2.add(50);
        list2.add(60);

        System.out.println(list2); // [50, 60]

        list1.addAll(list2);
        System.out.println(list1); // [10, 20, 50, 60]

        ArrayList <Integer> list3 = new ArrayList<>();
        ArrayList <Integer> list4 = new ArrayList<>();

        list3.add(1);
        list3.add(2);
        list3.add(3);
        list3.add(4);

        System.out.println(list3); // [1, 2, 3, 4]

        list4.add(7);
        list4.add(8);
        list4.add(9);


        list3.addAll(2, list4);
        System.out.println(list3); // [1, 2, 7, 8, 9, 3, 4]



        


    }
    

}
