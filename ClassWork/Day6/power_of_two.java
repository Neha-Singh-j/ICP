package ICP.ClassWork.Day6;

public class power_of_two {
    public boolean isPowerOfTwo(int n) {
         if (n <= 0) return false;  
        return pow(n, 1);           // start with 2^0 = 1
    }

    public static boolean pow(int n, int val) {
        if (val == n) return true;  // found power of 2
        if (val > n) return false;
         if (val > Integer.MAX_VALUE / 2) return false; //prevent overflow  
        return pow(n, val * 2);     // check next power of 2
    }

}
