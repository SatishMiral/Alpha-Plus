public class Q2_IsEven {
    public static void main(String[] args) {
        boolean ans =isEven(5);
        System.out.println(ans);
    }

    public static boolean isEven(int n){
        if (n%2==0){
            return true;
        }
        else{
            return false;
        }
    }
}
