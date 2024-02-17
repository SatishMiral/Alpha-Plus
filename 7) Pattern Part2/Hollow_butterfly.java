public class Hollow_butterfly {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                if(i==1||i==5||j==1||j==i){
                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int j=1;j<=2*(5-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                if(i==1||i==5||j==1||j==i){
                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for(int i=5;i>0;i--){
            for(int j=1;j<=i;j++){
                if(i==1||i==5||j==1||j==i){
                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int j=1;j<=2*(5-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                if(i==1||i==5||j==1||j==i){
                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
