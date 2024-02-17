public class Inv_left_num_pyra {
    public static void main(String[] args) {
        // int num = 1;
        // for(int i=5;i>0;i--){
        //     for(int j=i;j>0;j--){
        //         System.out.print(num);
        //         num++;
        //     }
        //     System.out.println();
        //     num = 1;
        // }
        // System.out.println();
        // num = 1;

        // optimum solution
        for(int i=5;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
