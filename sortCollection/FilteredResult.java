package sortCollection;

public class FilteredResult {
    private int[] evenNumbers;
    private int[] oddNumbers;

    public FilteredResult(int[] evenNumbers, int[] oddNumbers) {
        this.evenNumbers = evenNumbers;
        this.oddNumbers = oddNumbers;
    }

    public int[] getEvenNumbers() {
        return evenNumbers;
    }

    public int[] getOddNumbers() {
        return oddNumbers;
    }
}
