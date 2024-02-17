public class Main {
    public static void main(String[] args) {
        int[] arr = {2, -3, 4, -1, -2, 1, 5, -3};
        arr = satish(arr);

        // Print the rearranged array.
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] satish(int[] arr) {
        int j = 0;

        // Traverse the array. If element encountered is positive, then replace the element at index 'j' in the array with this element.
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                arr[j] = arr[i];
                j++;
            }
        }

        // If negative numbers were found, then replace remaining elements with 1.
        while (j < arr.length) {
            arr[j] = 1;
            j++;
        }

        return arr;
    }
}
