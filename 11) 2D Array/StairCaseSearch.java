public class StairCaseSearch {
    public static boolean stairCaseSearch(int matrix[][],int key){
        int row = matrix.length-1, col = 0;

        while(row < matrix.length && col >= 0){
            if(matrix[row][col]==key){
                System.out.println("Found at (" + row + "," + col + ")");
                return true;
            }

            else if(key < matrix[row][col]){
                row--;
            }
            else{
                col++;
            }
        }
        System.out.println("key not found!");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][]={
            {10,20,30,40},
            {15,25,35,45},
            {27,29,39,48},
            {32,33,43,50}
        };
        int key = 39;

        stairCaseSearch(matrix, key);
    }
}