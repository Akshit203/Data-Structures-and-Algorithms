import java.util.*;

public class UsingArray {

    static class Stack {

        int arr [] = new int[5];
        int top = -1;

        // Method to add an element to the stack

        void push(int x){
            if(isFull()){
                System.out.println("Stack Overflow");
                return;
            }
            top++;
            arr[top] = x;
        }
            
        // Method to return the top element of the stack without removing it
        int peek(){
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }
            return arr[top];
        }

        // Method to remove and return the top element from the stack (pop operation)
        int pop(){
            if (isEmpty()){
                System.out.println("Stack is Empty");
                return -1;
            }
            int remove = arr[top];
            top --;
            return remove;
        }
    
        int size(){
            return top + 1;
        }
    
        boolean isEmpty(){
            return top == - 1;

        }
    
        boolean isFull(){
            return top == arr.length - 1;
        }

        void display(){
            for(int i = 0; i <= top; i++){
                System.out.println(arr[i]);
            }
        }

    }

    

    public static void main(String[] args){
        
        Stack s1 = new Stack();

        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);

        s1.display();

        System.out.println(s1.peek());
        System.out.println(s1.isEmpty()); // false

        System.out.println(s1.pop());

        System.out.println(s1.isFull());

    }
    
}
