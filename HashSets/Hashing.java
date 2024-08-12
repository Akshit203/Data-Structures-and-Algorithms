import java.util.HashSet;
import java.util.Iterator;

public class Hashing {
    public static void main(String[] args) {

        HashSet<Integer> h1 = new HashSet<>();

        // Insertion
        h1.add(10);
        h1.add(20);
        h1.add(30);
        h1.add(10); // Duplicate element, will not be added
        h1.add(40);
        h1.add(10); // Duplicate element, will not be added

        // Elements are not in order because in HashSet, elements are stored in an unordered way

        System.out.println(h1);
        System.out.println("Size: " + h1.size());

        // Searching

        if (h1.contains(10)) {
            System.out.println("Set contains 10");
        }
        if (!h1.contains(50)) {
            System.out.println("Set does not contain 50");
        }

        // Removing an element

        h1.remove(10);
        System.out.println("After removing 10: " + h1);

        // Iteration
        // HashSet doesn't work like arrays with for loops, because HashSet does not have indexes

        Iterator<Integer> itr = h1.iterator();

        // System.out.println(itr.next());
        // System.out.println(itr.next());
        // System.out.println(itr.next());

        System.out.println(itr.hasNext()); // true
        
        // Using while loop to iterate through the HashSet
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        /* 
        We do not get any guarantee about the order of elements when iterating over a HashSet. 
        
        The HashSet class in Java is part of the Java Collections Framework, and it implements the Set interface,
        which is backed by a hash table. 
        
        This means that the elements are stored in an unordered fashion, and the order can change when 
        the set is modified. */

        // Checking if there are more elements in the iterator

        System.out.println("Has next: " + itr.hasNext()); // false
    }
}
