import java.util.*;

public class ContainerWithMostWater {
    public static int containerWithMostWater(ArrayList<Integer> height){
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<height.size();i++){
            for(int j=i+1;j<height.size();j++){
                int width = j - i;
                int minH = Math.min(height.get(i), height.get(j));
                int currans = width * minH;
                if(currans > ans){
                    ans = currans;
                }
                // ans = Math.max(ans, currans);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(containerWithMostWater(height));
    }
}
