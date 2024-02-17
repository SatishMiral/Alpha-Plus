public class Fibonacci {
    public static int printFibonacci(int n){
        if (n==0 || n==1){
            return n;
        }
        int fnm1 = printFibonacci(n-1);
        int fnm2 = printFibonacci(n-2);
        return fnm1 + fnm2;
    }
    public static void main(String[] args) {
        System.out.println(printFibonacci(8));
    }
}
