public class PowerOfX {
    public static int xRaiseToN(int x, int n){
        if (n == 1){
            return x;
        }
        int ans = x * xRaiseToN(x, n-1);
        return ans;
    }
    public static int powerOfX(int x, int n){
        if (n == 1){
            return x;
        }
        int halfPower = powerOfX(x, n/2);
        int ans = halfPower * halfPower;
        if ((n % 2)!= 0){
            ans = x * ans;
        }

        return ans;
    }
    public static void main(String[] args) {
        System.out.println(xRaiseToN(2, 3));
        System.out.println(powerOfX(2, 6));
    }
}
