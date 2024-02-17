import java.util.*;
public class Sum_num {
    public static int printSum (int num1, int num2){ //parameters or formal parameters
        int sum = num1+num2;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans=printSum(a,b); //arguments or actual parameters
        System.out.println(ans);
    }
}
