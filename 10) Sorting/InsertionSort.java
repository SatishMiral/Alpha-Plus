public class InsertionSort {
    public static void getInsertionSort(int arr[]){
        for (int i=1;i<arr.length;i++){
            int curr = i;
            int prev = i-1;
            //Finding out the correct position to insert
            while(prev>=0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            //Insertion
            arr[prev+1] = curr;
        }
    }

    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {5,6,9,4,2,7};
        getInsertionSort(arr);
        printArray(arr);
    }
}