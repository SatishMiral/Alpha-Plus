public class Q1_PrintNumsOf7s {
    public static void printTimesOf7(int matrix[][],int key){
        int count = 0;
        for (int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[1].length;j++){
                if(key==matrix[i][j]){
                    count ++;
                }
            }
        }
        System.out.println("7 appears " + count + " times in this matrix.");
    }
    public static void main(String[] args) {
        int matrix[][]={{4,7,8},
                        {7,8,7}};
        int key = 7;
        printTimesOf7(matrix, key);
    }
}
