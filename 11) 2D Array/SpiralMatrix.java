public class SpiralMatrix{
    public static void printSpiral(int matrix[][]){
        int sRow = 0;
        int eRow = matrix.length-1;
        int sCol = 0;
        int eCol = matrix[0].length-1;

        while (sRow <= eRow && sCol <= eCol){
            //top
            for(int j=sCol;j<=eCol;j++){
                System.out.print(matrix[sRow][j] + " ");
            }

            //right
            for(int i=sRow+1;i<=eRow;i++){
                System.out.print(matrix[i][eCol] + " ");
            }

            //bottom
            for(int j=eCol-1;j>=sCol;j--){
                if(sRow == eRow){
                    break;
                }
                System.out.print(matrix[eRow][j] + " ");
            }

            //left
            for(int i=eRow-1;i>sRow;i--){
                if(sCol == eCol){
                    break;
                }
                System.out.print(matrix[i][sCol] + " ");
            }

            sCol++;
            sRow++;
            eCol--;
            eRow--;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int matrix[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };

        printSpiral(matrix);
    }
}