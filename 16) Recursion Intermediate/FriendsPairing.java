public class FriendsPairing {
    public static int pairsOfFriends(int n){
        if (n == 1 || n == 2){
            return n;
        }

        //choice
        //To be Single
        int fnm1 = pairsOfFriends(n-1);

        //To Pair with Someone
        int fnm2 = pairsOfFriends(n-2);

        //Possible Ways to Pair
        int ways = (n-1) * fnm2;
        
        //Final Ans of Ways of pairing or to be single
        int ans = fnm1 + ways;

        return ans;

    }
    public static void main(String[] args) {
        System.out.println(pairsOfFriends(3));
    }
}
