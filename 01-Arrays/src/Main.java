public class Main {

    public static void main(String[] args) {

        // =========================================================
        //                 DATA STRUCTURES JOURNEY
        // =========================================================
        // Before learning Java Collections, we need to understand
        // why we need Data Structures in the first place.
        //
        // A Data Structure is a way to organize and store data
        // so we can use and manipulate it efficiently.
        //
        // We will start with Arrays, then move to Java Collections.
        // =========================================================


        // ---------------------------------------------------------
        // 1. WITHOUT A DATA STRUCTURE
        // ---------------------------------------------------------
        // Imagine storing many values like this:

        int a = 10;
        int b = 20;
        int c = 30;
        int d = 30;
        int e = 30;
        int f = 30;
        int g = 30;
        int h = 30;

        // This becomes difficult to manage when we have
        // hundreds or thousands of values.
        //
        // We need a better way to store related data.


        // ---------------------------------------------------------
        // 2. ARRAY
        // ---------------------------------------------------------
        // An Array allows us to store multiple values
        // under one variable.

        int[] numbers = new int[10000];

        // Instead of creating 10,000 variables,
        // we can store 10,000 integers inside one array.
        //
        // Example:
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;

        // Accessing an element is done using its index:
        System.out.println(numbers[0]); // 10


        // =========================================================
        //                 LIMITATIONS OF ARRAYS
        // =========================================================


        // ---------------------------------------------------------
        // 1. Arrays are FIXED in size
        // ---------------------------------------------------------

        int[] arr = new int[5];

        // This array can store exactly 5 elements.
        //
        // Once the array is created, its size cannot be changed.
        //
        // If we need more space, we have to create a new array
        // and copy the old elements into it.
        //
        // This can be inconvenient when we don't know
        // the required size beforehand.


        // ---------------------------------------------------------
        // 2. Arrays are HOMOGENEOUS
        // ---------------------------------------------------------
        // An array normally stores elements of the same type.

        Student[] students = new Student[10];

        students[0] = new Student();
        students[1] = new Student();

        // The following is NOT allowed:
        // students[2] = new Book();

        // Because students is an array of Student objects.


        // ---------------------------------------------------------
        // BUT...
        // ---------------------------------------------------------
        // Java's type system allows us to use a common parent type.

        Object[] objects = new Object[10];

        objects[0] = new Student();
        objects[1] = new Student();
        objects[2] = new Book();

        // Student and Book are both Objects,
        // so they can be stored in an Object[].
        //
        // However, this does not remove the fact that
        // normal arrays are designed around a specific type.


        // ---------------------------------------------------------
        // 3. LIMITED READY-MADE API
        // ---------------------------------------------------------
        // Arrays don't provide many built-in methods for
        // common data manipulation operations.
        //
        // For example, an array does NOT directly provide
        // methods like:
        //
        // add()
        // remove()
        // contains()
        // sort()
        // search()
        //
        // We usually need to implement some operations ourselves
        // or use utility classes such as Arrays.


        // ---------------------------------------------------------
        // 4. INSERTION / DELETION CAN BE INCONVENIENT
        // ---------------------------------------------------------
        // Arrays have fixed positions.
        //
        // If we want to insert an element in the middle,
        // we may need to shift existing elements.
        //
        // The same applies when removing an element.
        //
        // Example:
        //
        // [10, 20, 30, 40]
        //
        // Insert 15:
        //
        // [10, 15, 20, 30, 40]
        //
        // Existing elements may need to be shifted.


        // ---------------------------------------------------------
        // 5. ARRAY SIZE MAY BE WASTED
        // ---------------------------------------------------------
        // If we create:

        int[] data = new int[1000];

        // But we only use 10 elements,
        // the remaining space is unused.
        //
        // On the other hand, if we need more than 1000 elements,
        // the array cannot grow automatically.


        // =========================================================
        //                     THE PROBLEM
        // =========================================================
        //
        // Arrays are useful and very fast for many operations,
        // but they have some limitations.
        //
        // We want data structures that can give us:
        //
        // - Dynamic size
        // - Easy insertion and removal
        // - Searching capabilities
        // - Sorting capabilities
        // - Ready-made APIs
        // - Different ways to organize data
        //
        // This is where Java Collections come in.
    }
}


// Example classes used above

class Student {

}

class Book {

}
