import java.util.Stack;

public class Insertion {
    public static void main(String[] args) {
        
        Stack <Integer> s1 = new Stack<>();
        Stack <Integer> temp_stack = new Stack<>();

        s1.push(10);        
        s1.push(20);
        s1.push(30);
        s1.push(40);
        s1.push(50);
        s1.push(60);

        System.out.println(s1); // [10, 20, 30, 40, 50, 60]

        int idx = 2; // Index where the new element will be inserted
        int x = 25; // Element to be inserted

        while (s1.size() > idx) {
            temp_stack.push(s1.pop());
        }

        System.out.println(s1); // [10, 20]
        s1.push(x);

        while(temp_stack.size() > 0){
            s1.push(temp_stack.pop());
        }

        System.out.println(s1); // [10, 20, 25, 30, 40, 50, 60]







    }
}
