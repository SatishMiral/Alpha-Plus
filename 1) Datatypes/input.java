import java.util.*;

public class input {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Name:");
            String name = sc.next();
            System.out.println(name);
        }
    }
}
