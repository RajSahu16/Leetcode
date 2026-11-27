import java.util.*;
public class PowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        int sum =1;
        for(int i=0;i<n;i++){
            if(sum==n){
               return true;
            }
            else if(sum>n){
                return false;
            }
             sum = sum*2;
        }
        return false;
    }
    public static void main(String[] args) {
        int n = 4;
       System.out.println(isPowerOfTwo(n));
    }
}
