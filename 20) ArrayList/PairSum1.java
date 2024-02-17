import java.util.ArrayList;

public class PairSum1 {
    public static boolean pairSum1(ArrayList<Integer> list, int target){
        int lp = 0;
        int rp = list.size()-1;
        while (lp != rp) {
            int ans = list.get(lp) + list.get(rp);
            if(ans == target){
                return true;
            }

            if(ans < target){
                lp++;
            }
            else{
                rp--;
            }
        }
        return false;
    }

    public static boolean pairSum2(ArrayList<Integer> list, int target){
        int bpt = -1;
        int n = list.size();
        for(int i=0; i<list.size();i++){
            if(list.get(i) > list.get(i+1)){
                bpt = i;
                break;
            }
        }
        int lp = bpt + 1;
        int rp = bpt;
        while(lp != rp){
            if(list.get(rp) + list.get(lp) == target){
                return true;
            }

            if(list.get(lp) + list.get(rp) < target){
                lp = (lp+1) % n;
            }
            else{
                rp = (n+rp-1) % n;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 16;
        // System.out.println(pairSum1(list,target));
        System.out.println(pairSum2(list,target));
    }
}
