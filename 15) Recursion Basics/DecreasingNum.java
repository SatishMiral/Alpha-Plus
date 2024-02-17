public class DecreasingNum {
    public static void printDecreasingNum(int n){
        if (n==0){
            return;
        }
        // printDecreasingNum(n-1);
        System.out.println(n);
        printDecreasingNum(n-1);
    }
    
    public static void main(String[] args) {
        printDecreasingNum(10);
    }
}
