public class Q2_PrintSumOfaRow {
    public static void printSumOfaRow(int matrix[][]){
        int sum=0;
        for(int j=0;j<matrix[0].length;j++){               
                sum += matrix[1][j]; 
            }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int matrix[][]={{4,7,8},
                        {11,4,3},
                        {2,2,4}};
        printSumOfaRow(matrix);
    }
}
