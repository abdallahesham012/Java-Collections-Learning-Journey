import java.util.ArrayList;
import java.util.Collection;

public class Main {

    public static void main(String[] args) {

        /*
         * ============================================================
         * Collection Interface
         * ============================================================
         *
         * Collection is the root interface for most Java collections.
         *
         * Common operations:
         * - add()       -> Add an element
         * - remove()    -> Remove an element
         * - contains()  -> Check if an element exists
         * - size()      -> Get number of elements
         * - isEmpty()   -> Check if collection is empty
         * - clear()     -> Remove all elements
         * - forEach()   -> Iterate over elements
         *
         * Here:
         * Collection<String> -> Reference type
         * ArrayList<>        -> Actual implementation
         */

        Collection<String> fruitCollection = new ArrayList<>();


        // ============================================================
        // 1. add()
        // ============================================================
        // Adds elements to the collection.

        fruitCollection.add("Banana");
        fruitCollection.add("Apple");
        fruitCollection.add("Mango");

        System.out.println("Collection: " + fruitCollection);


        // ============================================================
        // 2. size()
        // ============================================================
        // Returns the number of elements in the collection.

        System.out.println("Size: " + fruitCollection.size());


        // ============================================================
        // 3. contains()
        // ============================================================
        // Checks whether a specific element exists.

        System.out.println("Contains Apple: "
                + fruitCollection.contains("Apple"));

        System.out.println("Contains Orange: "
                + fruitCollection.contains("Orange"));


        // ============================================================
        // 4. remove()
        // ============================================================
        // Removes the specified element from the collection.

        fruitCollection.remove("Banana");

        System.out.println("After removing Banana: "
                + fruitCollection);


        // ============================================================
        // 5. forEach()
        // ============================================================
        // Used to iterate through all elements.

        System.out.println("Elements:");

        fruitCollection.forEach(element -> {
            System.out.println(element);
        });


        // ============================================================
        // 6. isEmpty()
        // ============================================================
        // Checks whether the collection contains no elements.

        System.out.println("Is collection empty: "
                + fruitCollection.isEmpty());


        // ============================================================
        // 7. clear()
        // ============================================================
        // Removes ALL elements from the collection.

        fruitCollection.clear();

        System.out.println("After clear: " + fruitCollection);


        // ============================================================
        // 8. Check again
        // ============================================================

        System.out.println("Size after clear: "
                + fruitCollection.size());

        System.out.println("Is collection empty: "
                + fruitCollection.isEmpty());
    }
}