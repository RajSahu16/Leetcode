import java.util.*;
public class SearchRotatedSortedArray {

    public static void Search (int nums[],int target){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                System.out.println(i);
                break;
            }
            else{
                System.out.println("-1");
            }
        }
    }
    public static void main(String[] args) {
    int nums[]={4,5,6,7,0,1,2};

    Search(nums,4);
    }
}
