import java.util.HashSet;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        // 1. Create a HashSet and add integers
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(50);
        hashSet.add(10);
        hashSet.add(30);
        hashSet.add(20);
        hashSet.add(40);

        // 2. Create a TreeSet and add the same integers
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.addAll(hashSet); // add all elements from hashSet

        // 3. Display HashSet (unordered)
        System.out.println("HashSet elements (unordered): " + hashSet);

        // 4. Display TreeSet (sorted)
        System.out.println("TreeSet elements (sorted): " + treeSet);
    }
}
