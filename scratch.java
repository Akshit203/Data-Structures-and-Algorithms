public class scratch {

    static class Node {
        int data;
        Node next;

        Node (int data){
            this.data = data;
        }
    }

    static class LinkedList {

        Node head = null;
        Node tail = null;

        void addAtEnd(int val){
            Node temp = new Node(val);
            if (head == null){
                head = temp;
                tail = temp;
            }
            else{
                tail.next = temp;
                tail = temp;
            }
        }

        void inserAtStart(int val){
            Node temp = new Node(val);

            if (head == null){
                head = temp;
                temp.next = null;
            }

            else{
                temp.next = head;
                head = temp;
            }
        }

        void insertAtIndex(int idx, int val){

            Node temp = new Node(val);
            Node t = head;

            for (int i = 0; i < idx - 1 ; i++){
                t = t.next;
            }
            temp.next = t.next;
            t.next = temp;
        }

        void getIndexValue(int index){
            Node t = head;

            for (int i = 0; i < index - 1 ; i++){
                t = t.next;
            }

            System.out.println("value at index " +index +" is : " +t.next.data); 
        }

        void deleteIndex (int val){
            Node temp = head;

            for (int i = 0; i < val - 1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }

        void displaySize(){
            Node temp = head;
            int count = 0;

            while (temp != null){
                count++;
                temp = temp.next;
            }
            System.out.println("Size is : " + count);

        }


        void display(){
            Node temp = head;
            while(temp != null){
                System.out.println(temp.data +" ");
                temp = temp.next;
            }
        }

    }

    public static void main(String [] args){

        LinkedList ll = new LinkedList();
        ll.addAtEnd(10);
        ll.addAtEnd(20);
        ll.addAtEnd(30);
        ll.addAtEnd(40);

        ll.inserAtStart(1);

        ll.display();
        ll.displaySize();

        ll.insertAtIndex(3,25);
        ll.display();

        ll.getIndexValue(2);
        ll.deleteIndex(4);
        System.out.println("**************");
        ll.display();



    }
}
