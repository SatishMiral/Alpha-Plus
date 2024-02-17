import java.util.*;
public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        System.out.println("Enter a Number:");
        int n = sc.nextInt();

        if(n==2){
            System.out.println("2 is Prime");
        }
        boolean isPrime = true;
        for(int i=2;i<Math.sqrt(n);i++){
            if((n%i)==0){
                isPrime = false;
            }
        }

        if(isPrime==true){
            System.out.println(n+" is Prime");
        }
        else{
            System.out.println(n+" is Not Prime");
        }
    }
}
