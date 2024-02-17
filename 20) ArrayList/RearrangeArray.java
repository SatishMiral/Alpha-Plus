import java.util.Arrays;

public class RearrangeArray {
    public static void main(String[] args) {
        int[] array = {-2, 3, -5, 7, -11, 2, -4};

        System.out.println("Original Array: " + Arrays.toString(array));

        rearrangeArray(array);

        System.out.println("Modified Array: " + Arrays.toString(array));
    }

    public static void rearrangeArray(int[] array) {
        int n = array.length;
        int positiveIndex = 0;

        // Move negative numbers to the end and replace them with 1
        for (int i = 0; i < n; i++) {
            if (array[i] < 0) {
                int temp = array[i];
                array[i] = 1;
                array[positiveIndex] = temp;
                positiveIndex++;
            }
        }
    }
}
