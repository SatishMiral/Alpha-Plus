public class TilesProb {
    public static int tilingProb(int n){
        if (n == 0 || n == 1){
            return 1;
        }
        //Vertical Choice
        int fnm1 = tilingProb(n-1);
        
        //Horizontal Choice
        int fnm2 = tilingProb(n-2);

        //Total ways
        int ans = fnm1 + fnm2;
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(tilingProb(9));
    }
}
