public class SumOfNaturalNums {
    public static int printSumOfNaturalNums(int n){
        if (n == 1){
            return 1;
        }
        int fnm1 = printSumOfNaturalNums(n-1);
        int ans = n + fnm1;
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(printSumOfNaturalNums(7));
    }
}
