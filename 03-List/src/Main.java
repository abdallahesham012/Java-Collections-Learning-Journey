import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        /*
         * ============================================================
         * 1. Creating a List
         * ============================================================
         *
         * List is an interface in the Java Collection Framework.
         *
         * ArrayList is one of the implementations of the List interface.
         *
         * We use:
         *
         *     List<String> list = new ArrayList<>();
         *
         * instead of:
         *
         *     ArrayList<String> list = new ArrayList<>();
         *
         * because we usually program against the interface (List),
         * not the implementation.
         */
        List<String> list = new ArrayList<>();


        /*
         * ============================================================
         * 2. List Allows Duplicate Elements
         * ============================================================
         *
         * Unlike Set, List allows duplicate elements.
         */
        list.add("element1");
        list.add("element1");
        list.add("element2");
        list.add("element2");

        System.out.println("Duplicates: " + list);


        /*
         * ============================================================
         * 3. List Allows null Elements
         * ============================================================
         *
         * A List can contain null values.
         *
         * ArrayList allows multiple null elements.
         */
        list.add(null);
        list.add(null);

        System.out.println("With null values: " + list);


        /*
         * ============================================================
         * 4. List Maintains Insertion Order
         * ============================================================
         *
         * List keeps elements in the same order in which they
         * were inserted.
         *
         * Example:
         *
         * Add:
         * element1
         * element2
         * element4
         * element3
         * element5
         *
         * The List will keep exactly this order.
         */
        list.add("element1");
        list.add("element2");
        list.add("element4");
        list.add("element3");
        list.add("element5");

        System.out.println("Insertion order: " + list);


        /*
         * ============================================================
         * 5. Accessing Elements Using Index
         * ============================================================
         *
         * List elements are indexed starting from 0.
         *
         * Index:
         *
         * 0 -> first element
         * 1 -> second element
         * 2 -> third element
         * ...
         *
         * We use get(index) to access an element.
         */
        System.out.println("Element at index 0: " + list.get(0));
        System.out.println("Element at index 4: " + list.get(4));


        /*
         * ============================================================
         * 6. Size of the List
         * ============================================================
         *
         * size() returns the number of elements currently stored
         * in the List.
         *
         * Note:
         * null is also counted as an element.
         */
        System.out.println("List size: " + list.size());


        /*
         * ============================================================
         * 7. Checking if an Element Exists
         * ============================================================
         *
         * contains() checks whether the List contains a specific
         * element.
         */
        System.out.println("Contains element1? " + list.contains("element1"));
        System.out.println("Contains element10? " + list.contains("element10"));


        /*
         * ============================================================
         * 8. Updating an Element
         * ============================================================
         *
         * set(index, value) replaces the element at the specified
         * index.
         *
         * It does NOT add a new element.
         */
        list.set(0, "updatedElement");

        System.out.println("After update: " + list);


        /*
         * ============================================================
         * 9. Removing an Element
         * ============================================================
         *
         * remove(index)
         *     -> removes the element at a specific index.
         *
         * remove(object)
         *     -> removes the first occurrence of the specified object.
         */
        list.remove(0);

        System.out.println("After removing index 0: " + list);


        /*
         * ============================================================
         * 10. Checking if the List is Empty
         * ============================================================
         */
        System.out.println("Is list empty? " + list.isEmpty());


        /*
         * ============================================================
         * 11. Iterating Through a List
         * ============================================================
         *
         * Enhanced for-loop is one of the simplest ways to traverse
         * all elements.
         */
        System.out.println("\nIterating through the List:");

        for (String element : list) {
            System.out.println(element);
        }


        /*
         * ============================================================
         * 12. Important Characteristics of List
         * ============================================================
         *
         * List:
         *
         * ✓ Allows duplicate elements
         * ✓ Allows null elements (depends on implementation)
         * ✓ Maintains insertion order
         * ✓ Elements are indexed
         * ✓ Allows access by index
         * ✓ Supports adding, updating and removing elements
         *
         * Common List implementations:
         *
         *     ArrayList
         *     LinkedList
         *     Vector
         *
         * The most commonly used implementation is ArrayList.
         */
    }
}
