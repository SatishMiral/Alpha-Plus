import java.util.ArrayList;

public class ContainerWithMostWaterOptimised {
    public static int containerWithMostWater(ArrayList<Integer> height){
        int ans = 0;
        int lp = 0;
        int rp = height.size()-1;
        while(lp < rp){
            int minHeigth = Math.min(height.get(lp), height.get(rp));
            int width = rp - lp;
            int currans = minHeigth * width;
            ans = Math.max(ans, currans);
            if(height.get(lp) < height.get(rp)){
                lp++;
            }
            else{
                rp--;
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