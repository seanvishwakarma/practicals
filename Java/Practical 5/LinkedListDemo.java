import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListDemo {
    public static void main(String[] args) {
        // 1. Create a LinkedList of integers
        LinkedList<Integer> list = new LinkedList<>();

        // 2. Add elements at both ends
        list.addFirst(10); // add at the beginning
        list.addLast(20);  // add at the end
        list.addFirst(5);  // add at the beginning
        list.addLast(30);  // add at the end

        System.out.println("LinkedList after adding elements: " + list);

        // 3. Remove elements
        int removedFirst = list.removeFirst(); // remove from beginning
        int removedLast = list.removeLast();   // remove from end
        System.out.println("Removed first element: " + removedFirst);
        System.out.println("Removed last element: " + removedLast);

        // 4. Display remaining elements using an iterator
        System.out.println("Remaining elements in LinkedList:");
        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
