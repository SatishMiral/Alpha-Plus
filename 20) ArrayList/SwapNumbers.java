import java.util.*;

public class SwapNumbers {
    public static void swap(ArrayList<Integer> list,int idx1, int idx2){
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(4);
        list.add(9);
        list.add(2);
        list.add(3);

        int idx1 = 1 , idx2 = 4;
        System.out.println(list);
        swap(list, idx1, idx2);
        System.out.println(list);
        //Ascending Order
        Collections.sort(list);
        System.out.println(list);
        //Descending Order
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
}