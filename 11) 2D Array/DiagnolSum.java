public class DiagnolSum {
    public static void printDiagnolSum(int matrix[][]){
        // int m = matrix.length-1;
        // int ans = 0;
        // int eCol = matrix.length-1;
        // int sRow = 0;
        // for(int i=0;i<=m;i++){
        //     for(int j=0;j<=m;j++){
        //         if(i == j){
        //             ans += matrix[i][j];
        //         }

        //         if(i == sRow && j == eCol){
        //             ans += matrix[i][j];
        //             sRow++;
        //             eCol--;
        //         }
        //     }
        // }
        // System.out.println(ans);
        int sum = 0;

        for(int i=0; i<matrix.length; i++){
            sum += matrix[i][i];

            if(i != matrix.length-1-i){
                sum += matrix[i][matrix.length-1-i];
            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int matrix[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };

        printDiagnolSum(matrix);
    }
}
