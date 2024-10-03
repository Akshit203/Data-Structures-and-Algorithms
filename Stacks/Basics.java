import java.util.*;

public class Basics {

    public static void main(String[] args) {
        
        Stack <Integer> s1 = new Stack<>();

        System.out.println(s1.isEmpty()); // true

        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);

        System.out.println(s1); // [10, 20, 30, 40]
        System.out.println(s1.peek()); // 40

        s1.pop();
        s1.pop();
        System.out.println(s1); // [10, 20]

        System.out.println(s1.size()); // 2

        System.out.println(s1.isEmpty()); // false

        // copying stack elements from one stack to another stack

        Stack <Integer> s2 = new Stack<>();
        Stack <Integer> s2_rev = new Stack<>();

        Stack <Integer> copy_stack = new Stack<>();

        s2.push(2);
        s2.push(4);
        s2.push(6);
        s2.push(8);
        s2.push(10);

        System.out.println(s2); // [2, 4, 6, 8, 10]

        while(s2.size() > 0){

            // s2_rev.push(s2.pop()); // [10, 8, 6, 4, 2]

            int x = s2.peek();
            s2_rev.push(x);
            s2.pop();

        }

        System.out.println(s2_rev); // [10, 8, 6, 4, 2]

        while(s2_rev.size() > 0){
            copy_stack.push(s2_rev.pop());
        }

        System.out.println(copy_stack); // [2, 4, 6, 8, 10]







    }
    
}
