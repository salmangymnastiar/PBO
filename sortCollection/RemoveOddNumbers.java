package sortCollection;

import java.util.ArrayList;
import java.util.List;

public class RemoveOddNumbers {
    // Method to remove odd numbers from the array
    public FilteredResult removeOddNumbers(int[] arr) {
        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();

        for (int num : arr) {
            if (num % 2 == 0) {
                evenNumbers.add(num);
            } else {
                oddNumbers.add(num);
            }
        }

        int[] evenArray = new int[evenNumbers.size()];
        for (int i = 0; i < evenNumbers.size(); i++) {
            evenArray[i] = evenNumbers.get(i);
        }

        int[] oddArray = new int[oddNumbers.size()];
        for (int i = 0; i < oddNumbers.size(); i++) {
            oddArray[i] = oddNumbers.get(i);
        }

        return new FilteredResult(evenArray, oddArray);
    }
}
