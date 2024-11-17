// What is an array?
// An array is a collection of elements of the same type, stored in contiguous memory locations. 
// In Java, an array must be explicitly initialized to allocate memory for it.

// How do we declare and initialize an array? Here's an example:
    int[] number = new int[5];

// now let's break it down
// 1. int[]:
// This declares a variable number that will store an array of integers.
// Normally, when we declare and initialize a single int variable, it looks like this:
    int number = 5; // A single integer value.
// However, an array is not a single value it’s a collection of values.
// So we declare it differently, using int[], to indicate that this variable will hold multiple integers

// 2. new int[5]:
// The keyword "new" is used to allocate memory for the array.
// "[5]" specifies the size of the array, meaning it can store 5 integers.
// NOTE: The size of an array is determined by the value you provide when initializing it.
//       You can specify the array size based on your needs.
// Without this, Java doesn’t know how much memory to allocate. So, it's important to remember.

// Now let’s talk about two methods to initialize this array.

// Method 1: Declare and Initialize Separately
// -You declare the array first, then allocate memory for it in a separate step.
//  Just like in our example.
        int[] number = new int[5]
//  Now let's add value to our array.
//  You can assign values to specific indices after initialization
//  Indices are the positions in the array, starting from 0.
//  Example of adding values:
        number[0] = 10; // Assign 10 to the first element (index 0)
        number[1] = 20; // Assign 20 to the second element (index 1)
        number[2] = 30; // Assign 30 to the third element (index 2)
        number[3] = 40; // Assign 40 to the fourth element (index 3)
        number[4] = 50; // Assign 50 to the fifth element (index 4)
//  Resulting array:
//  Index   | 0   | 1   | 2   | 3   | 4   |
//  Value   | 10  | 20  | 30  | 40  | 50  |
//  You can also access values using their index:
        System.out.println(number[0]); // Output: 10
        System.out.println(number[4]); // Output: 50

// Method 2: Declare and Initialize with Values (Inline Initialization)
//  -You declare and assign values to the array in a single step.
//  Example:
        int[] number = {10, 20, 30, 40, 50};
//  Here, the array size is automatically determined by the number of values provided.
//  The resulting array is the same as Method 1:
//  Index   | 0   | 1   | 2   | 3   | 4   |
//  Value   | 10  | 20  | 30  | 40  | 50  |
//  You can also access or modify the values just like before:
        System.out.println(number[2]); // Output: 30
        number[2] = 35; // Update the value at index 2
        System.out.println(number[2]); // Output: 35

// Now let's print all the elements in the array using a for() loop
public class Introduction_to_Arrays {
    public static void main(String[] args) {
        // Declare and initialize the array with values
        int[] number = {10, 20, 30, 40, 50};

        // Using a for loop to print all elements in the array
        for (int i = 0; i < number.length; i++) {
            // The loop starts with i = 0, which refers to the first element in the array
            // i < number.length ensures the loop will run as long as i is less than the length of the array (5 in this case)
            // number[i] accesses and prints each element at index i in the array
            System.out.println(number[i]);
            // The for loop prints each element of the array one by one:
            // Output: 10
            //         20
            //         30
            //         40
            //         50
        }
    }
}
