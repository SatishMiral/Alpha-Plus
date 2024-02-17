public class Q1_Avg {
    public static void main(String[] args) {
        calAvg(132, 222, 23);
    }

    public static void calAvg(int a, int b, int c){
        int avg = (a+b+c)/3;
        System.out.println("The Average is: "+avg);
    }
}