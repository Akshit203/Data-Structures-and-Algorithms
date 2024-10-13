
public class UsingLinkedList {

    static class Node{
        int val;
        Node next;

        Node(int val){
            this.val = val;
        }
    }

    static class StackUsingLinkedList{
        
        Node head = null;

        // Push operation to add an element to the stack

        void push(int x){
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
        }

        // Peek operation to view the top element without removing it
        int peek(){
            if (isEmpty()){
                System.out.println("Stack Underflow");
                return -1;
            }
            return head.val;
        }

        // Pop operation to remove the top element from the stack
        int pop(){
            if (isEmpty()){
                System.out.println("Stack Underflow");
                return -1;
            }
            Node temp = head;
            head = head.next;

            return temp.val;
        }

        // Method to check if the stack is empty
        boolean isEmpty(){
            return head == null;
        }

        // Display the elements of the stack
        void display (){

            Node temp = head;
            while (temp !=null){
                System.out.println(temp.val);
                temp = temp.next;
            }
        }

        // size of the stack
        int size(){
            Node temp = head;
            int count = 0;

            while (temp !=null){
                count ++;
                temp = temp.next;
            }
            return count;

        }

    }
    public static void main(String[] args) {

        StackUsingLinkedList s1 = new StackUsingLinkedList();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);

        s1.display();

        System.out.println(s1.size());

        System.out.println(s1.peek());

        System.out.println(s1.isEmpty());
        
    }
}
