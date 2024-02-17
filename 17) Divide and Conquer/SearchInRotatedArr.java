public class SearchInRotatedArr {
    public static int search(int arr[],int si, int ei,int tar){
        if(si>ei){
            return -1;
        }
        int mid = si + (ei-si)/2;

        //case found
        if(arr[mid] == tar){
            return mid;
        }

        //mid on Line 1
        if(arr[mid] >= arr[si]){
            if(arr[si]<= tar && tar<=arr[mid]){
                //case a:left
                return search(arr, si, mid-1, tar);
            }
            else{
                //case b:right
                return search(arr, mid+1, ei, tar);
            }
        }
        //mid on Line 2
        else{
            if(arr[mid] <=tar && arr[ei]>=tar){
                //case c:right
                return search(arr, mid+1, ei, tar);
            }
            else{
                //case d:left
                return search(arr, si, mid-1, tar);
            }
        }
        // return mid;
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2,3};
        int target = 0;
        int ans = search(arr, 0, arr.length-1,target);
        System.out.println(ans);
    }
}