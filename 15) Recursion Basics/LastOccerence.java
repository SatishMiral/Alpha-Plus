public class LastOccerence {
    public static int lastOccurence(int arr[], int key, int i){
        if (i == -1){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return lastOccurence(arr, key, i-1);
    }
    public static int lastOccurence2(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        int lastFound = lastOccurence2(arr, key, i+1);
        if (lastFound == -1 && arr[i] == key){
            return i;
        }
        return lastOccurence2(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,7,4,1,2,5,2,9};
        System.out.println(lastOccurence(arr, 2, 10));
        System.out.println(lastOccurence2(arr, 2, 0));
    }
}
