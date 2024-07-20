package sortCollection;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        SelectionSort ob = new SelectionSort();
        PrintArray pa = new PrintArray();
        InsertionSort is = new InsertionSort();
        FindTheLargest fl = new FindTheLargest();
        FindTheSmallest fs = new FindTheSmallest();
        RemoveOddNumbers ro = new RemoveOddNumbers();
        Scanner sc = new Scanner(System.in);

        // Take the array size from the user
        System.out.println("Enter the size of the array: ");
        int arr_size = 0;
        if (sc.hasNextInt()) {
            arr_size = sc.nextInt();
        }

        // Initialize the array's size using user input
        int[] arr = new int[arr_size];

        // Take user elements for the array
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < arr_size; i++) {
            if (sc.hasNextInt()) {
                arr[i] = sc.nextInt();
            }
        }

        System.out.println("Given array");
        pa.PrintArray(arr);

        // Find the largest number in the array
        System.out.println("The Largest Number in array");
        pa.PrintArray(fl.findlargest(arr));

        System.out.println("The Smallest Number in array");
        pa.PrintArray(fs.findsmallest(arr));

        // Remove odd numbers and print the arrays
        FilteredResult result = ro.removeOddNumbers(arr);
        System.out.println("Array after removing odd numbers");
        pa.PrintArray(result.getEvenNumbers());

        System.out.println("Removed odd numbers");
        pa.PrintArray(result.getOddNumbers());
    }
}
