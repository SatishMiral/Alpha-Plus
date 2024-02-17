public class BinaryString {
    //print binary strings without consecutive one's of length n
    public static void binString (int n, int lastPlace, String str){
        //Base case
        if(n == 0){
            System.out.println(str);
            return;
        }

        if(lastPlace == 0){
            binString(n-1, 0 , str + "0");
            binString(n-1, 1, str + "1");
        }
        else{
            binString(n-1, 0 , str + "0");
        }

        // binString(n-1, 0, str+"0");
        // if(lastPlace == 0){
        //     binString(n-1, 1, str+"1");
        // }
    }
    public static void main(String[] args) {
        binString(3, 0, "");
    }
}
