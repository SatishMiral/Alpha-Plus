public class Q3_LengthOfString {
    public static void lengthOfString(String str, int i, int ans){
        char currchar = str.charAt(i);
        if (currchar == ' '){
            System.out.println(ans);
            return;
        }
        lengthOfString(str, i+1, ans+1);
    }
    public static void main(String[] args) {
        lengthOfString("satish", 0, 0);
    }
}
