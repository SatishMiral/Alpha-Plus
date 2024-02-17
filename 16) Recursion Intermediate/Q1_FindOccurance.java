public class Q1_FindOccurance {
    public static void printOccurance(int arr[], int i, int key){
        if (i == arr.length){
            return;
        }

        if (arr[i] == key){
            System.out.print(i+ " ");
        }
        printOccurance(arr, i+1, key);
    }
    public static void main(String[] args) {
        int arr[] = {2,4,5,6,2,4,3,2,4,6,2};
        printOccurance(arr, 0, 2);
    }
}
