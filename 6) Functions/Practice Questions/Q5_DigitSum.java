public class Q5_DigitSum {
    public static void main(String[] args) {
        int ans = digitSum(1234567890);
        System.out.println(ans);
    }

    public static int digitSum(int n){
        // int num = n;
        int sum = 0;
        while (n>0){
            int lastDigit = n%10;
            sum = sum+lastDigit;
            n = n/10;
        }
        return sum;
    }
}
