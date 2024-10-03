import java.util.*;
public class Display {

    // 1 2 3 4
    // Function to display the stack elements in reverse order without modifying the stack

    static void displayRev(Stack <Integer> s1){
        if (s1.size() == 0){
            return;
        }
        int top = s1.pop();
        System.out.print(top + " ");
        displayRev(s1);

        // Push the popped element back onto the stack to restore its original state

        s1.push(top);

    }

    // 1 2 3 4

    static void displayRecursive(Stack <Integer> s1){
        if (s1.size() == 0){
            return;
        }
        int top = s1.pop();
        displayRecursive(s1);

        System.out.print(top + " ");
        s1.push(top);


    }
    public static void main(String[] args) {

        Stack <Integer> s1 = new Stack<>();

        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);

        System.out.println(s1); // original stack
        
        displayRev(s1); // reverse stack
        System.out.println(" ");

        displayRecursive(s1);
        
    }
}
