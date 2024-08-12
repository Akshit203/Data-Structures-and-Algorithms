import java.util.*;

public class Basics {

    // Display Linked List using Recursion
    public static void displayR(Node head){
        if (head == null){
            return;
        }
        System.out.println(head.data);
        display(head.next);
    }

    // Reverse Linked List display using Recursion
    public static void displayReverse(Node head){
        if (head == null){
            return;
        }
        displayReverse(head.next);
        System.out.println(head.data);
    }

    public static void display(Node head){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next; // Traverse through nodes n1, n2, ..., n5 
        }
    }

    // Calculate the Length of Linked List 
    public static int lengthOfList(Node head){
        int counter = 0;
        Node temp = head;
        while (temp != null){
            counter ++;
            temp = temp.next; // Traverse through nodes n1, n2, ..., n5 
        }
        System.out.println("length");

        return counter;
    }

    public static class Node {
        int data;
        Node next;
        
        Node (int data){  // Constructor to initialize node data
            this.data = data;
        }
    }
    
    public static void main(String[] args) {

        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        Node n5 = new Node(50);

        // Linked List: 10 -> 20 -> 30 -> 40 -> 50 

        n1.next = n2; // n1 points to n2
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = null;

        System.out.println(n1);      // Object reference: $Node2c7b84de
        System.out.println(n1.next); // Object reference: $Node3fee733d

        System.out.println(n2);      // Object reference: $Node3fee733d

        System.out.println(n1.next.data); // Output: 20
        
        // Limitation: Traversing a linked list takes O(n) time because each node contains a reference to the next node.

        // Advantage: Easy insertions

        // Types:
        // Singly, Doubly, Circular Linked List

        // Given a node, we can find the next node, but not the previous node in a singly linked list.

        // If a node's `next` is null, it is the tail of the linked list.

        // Traversing the Linked List

        Node temp = n1;

        System.out.println(n1.data); // Output: 10
        System.out.println(temp.data); // Output: 10

        // for (int i = 1; i <= 5; i++){
        //     System.out.println(temp.data);
        //     temp = temp.next; // Traverse through nodes n1, n2, ..., n5 
        // }

        // Since we often don't know the number of nodes, we'll use a while loop instead.

        // Displaying the linked list

        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next; // Traverse through nodes n1, n2, ..., n5 
        }

        System.out.println("***************");

        // Displaying the linked list using only the head node. 
        // The `display` function takes the head node as a parameter.

        display(n1);

        System.out.println("**************");
        displayR(n1);

        System.out.println("Reverse");
        displayReverse(n1);

        int x = lengthOfList(n1);
        System.out.println(x); // Output: 5
    }
}
