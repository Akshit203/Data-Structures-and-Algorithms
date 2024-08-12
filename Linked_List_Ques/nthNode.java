package Linked_List_Ques;

public class nthNode {
    public static class Node {
        int data;
        Node next;

        Node (int data){
            this.data = data;
        }
        
    }

    public static Node getNode(Node head, int x){
        Node start = head;
        Node end = head;

        for (int i = 0; i < x ; i++){
            end = end.next ;
        }

        while(end != null){
            start = start.next;
            end = end.next;
        }

        return start;

    }


    public static void main(String[] args) {

        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        Node n5 = new Node(50);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        Node y = getNode(n1, 4);
        System.out.println(y.data);
        
    }
}
