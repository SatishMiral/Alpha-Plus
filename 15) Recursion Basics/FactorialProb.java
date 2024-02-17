public class FactorialProb {
    public static int printFactorial(int n){
        if (n == 0){
            return 1;
        }
        int fnm1 = printFactorial(n-1);
        int fn = n * fnm1;
        return fn;

    }
    public static void main(String[] args) {
        System.out.println(printFactorial(5));
    }
}
