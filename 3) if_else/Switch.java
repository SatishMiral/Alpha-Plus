import java.util.*;
public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        int ch = sc.nextInt();
        switch(ch){
            case 1 : System.out.println("Samosa");break;
            case 2 : System.out.println("burger");break;
            case 3 : System.out.println("mango shake");break;
            default : System.out.println("Invalid");
        }
    }
}
