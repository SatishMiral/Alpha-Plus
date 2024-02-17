public class Swap {
    public static void swapNums(int a,int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a is "+a);
        System.out.println("b is "+b);
        // System.out.println(temp);
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swapNums(a, b);
    }
}
