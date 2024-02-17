import java.util.*;
public class NextGreaterElement {
    public static void nextGreaterElement(int arr[]){
        Stack<Integer> s = new Stack<>();
        int ans[] = new int[arr.length];
        for(int i=arr.length-1; i>=0; i--){
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }

            if(s.isEmpty()){
                ans[i] = -1;
            }
            else{
                ans[i] = arr[s.peek()];
            }

            s.push(i);
        }

        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {6,8,0,1,3};
        nextGreaterElement(arr);
    }
}
