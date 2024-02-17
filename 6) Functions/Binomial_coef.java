public class Binomial_coef {
    public static int calFactorial(int num){
        int f=1;
        for(int i=1;i<=num;i++){
            f = f*i;
        }
        return f;
    }

    public static long binCoeff(int n, int r){
        int nFact = calFactorial(n);
        int rFact = calFactorial(r);
        int nmrFact = calFactorial(n-r);
        long ans = nFact/(rFact*nmrFact);
        return ans;
    }
    public static void main(String[] args) {
        long ans = binCoeff(10, 5);
        System.out.println(ans);
    }
}
