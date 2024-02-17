public class Q3_Palindrome {
    public static void main(String[] args) {
        boolean ans = isPalindrome(10101);
        System.out.println(ans);
    }

    public static boolean isPalindrome(int n){
        int reverse = 0;
        int num = n;
        while(num!=0){
        int lastDigit = num % 10;
        reverse = reverse * 10+lastDigit;
        num = num/10;
        }

        if(reverse==n){
            return true;
        }
        else{
            return false;
        }
    }
}
