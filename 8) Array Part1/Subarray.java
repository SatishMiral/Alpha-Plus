public class Subarray {
    public static void printSubarray(int numbers[]){
        // int sum = 0;
        for(int i=0;i<numbers.length;i++){
            for(int j=i;j<numbers.length;j++){
                int sum = 0;
                for(int k=i;k<=j;k++){                    
                    System.out.print(numbers[k]+" ");
                    int num = numbers[k];
                    sum = sum+num;
                    // System.out.println(sum);                   
                }
                System.out.println("Sum is: "+sum);
            }           
        }
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        printSubarray(numbers);
    }
}