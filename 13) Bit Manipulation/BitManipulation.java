public class BitManipulation {
    public static void oddOrEven(int n){
        int bitmask = 1;
        if ((n & bitmask) == 0){
            //even number
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
    }

    public static void getIthBit(int n , int i){
        int bitmask = 1<<i;
        if((n&bitmask)==0){
            System.out.println("Number is 0");
        }
        else{
            System.out.println("Number is 1");
        }
    }

    public static int setIthBit(int n, int i){
        int bitmask = 1<<i;
        return (n | bitmask);
    }

    public static int clearIthBit(int n, int i){
        int bitmask = ~(1<<i);
        return (n & bitmask);
    }

    public static int updateIthBit(int n,int i,int newBit){
        if(newBit==0){
            return clearIthBit(n, i);
        }
        else{
            return setIthBit(n, i);
        }
    }

    public static int clearLastIBits(int n, int i){
        int bitmask = -1<<i;
        return n & bitmask;
    }

    public static int clearRangeOfBits(int n, int i, int j){
        int a = -1<<j+1;
        int b = (1<<i)-1;
        int bitmask = (a|b);
        return n & bitmask;
    }
    public static void main(String[] args) {
        // oddOrEven(1);
        // getIthBit(11, 3);
        // System.out.println(setIthBit(4, 1));
        // System.out.println(clearIthBit(10, 1));
        // System.out.println(updateIthBit(4, 1, 1));
        //System.out.println(clearLastIBits(15,2 ));
        System.out.println(clearRangeOfBits(10, 2, 4));
    }
}
