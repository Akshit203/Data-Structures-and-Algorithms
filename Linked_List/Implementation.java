public class Implementation {

    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class LinkedList{
        Node head;
        Node tail;

        // Method to insert a node at the end of the list
        void insertAtEnd(int val){
            Node temp = new Node(val);

            if (head == null){
                head = temp;  // Assign head to the new node
                tail = temp;  // Assign tail to the new node
            } 
            
            else {
                tail.next = temp;  // Link the current tail to the new node
                tail = temp;       // Update the tail to be the new node
            }
        }

        // Insertion At the beginning

        void insertAtBeginning(int val){
            Node temp = new Node(val);
            if (head == null){ // Empty List
                head = temp;
                tail = null;
            }
            else{  // Non - Empty List
                
                temp.next = head;
                head = temp;
            }

        }

        // Insert At specific index
        // 1 2 3 4 5 6 
        // 2545

        void insertAt (int idx, int val){
            Node t = new Node(val);
            Node temp = head;

            if(idx == sizeOfLinkedList()){
                insertAtEnd(val);
                return;
            }

            else if(idx == 0){
                insertAtBeginning(val);
                return;
            }

            else if (idx < 0 || idx > 0){
                System.out.println("Wrong Index");
                return;
            }

            for (int i = 1; i <= idx - 1; i++){
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;


        }

        // Get Element Method

        int getElementByIndex (int val){
            Node temp = head;

            for (int i = 1; i < val; i++){
                temp = temp.next;
            }
            return temp.data;
        }

        // Method to delete the node on given index

        void deleteIndex(int index) {

            Node temp = head;
            for (int i = 0; i <= index - 1; i++) {
                temp = temp.next;
            }

            if (index == 0){
                head = head.next;
            }

            temp.next = temp.next.next;

        }

        // Method to display the list
        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.data + "  ");
                temp = temp.next;
            }
        }

        int sizeOfLinkedList(){
            int counter = 0;

            Node temp = head;
            while (temp != null){
                counter++;
                temp = temp.next;
            }

            return counter;

        }
    }

    public static void main(String[] args) {
        
        LinkedList ll = new LinkedList();

        ll.insertAtEnd(10);
        ll.insertAtEnd(20); 
        ll.insertAtEnd(30);
        ll.insertAtEnd(40);



        // Display the linked list
        ll.display();
        int x = ll.sizeOfLinkedList();
        System.out.println("Size :"+x);

        System.out.println("****************");

        ll.insertAtBeginning(255);

        ll.insertAt(3, 97);
        ll.display();

        int ele = ll.getElementByIndex(3);
        System.out.println(ele);

        System.out.println("********");

        ll.deleteIndex(0);
        ll.display();

    }
}
