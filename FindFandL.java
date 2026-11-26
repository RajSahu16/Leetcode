
import java.util.*;

public class FindFandL {

    public static int[] searchRange(int nums[], int target) {

        int first = -1;
        int last = -1;

        int start = 0;
        int end = nums.length - 1;

        // First occurrence
        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                first = mid;
                end = mid - 1;
            }
            else if (nums[mid] < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }

        start = 0;
        end = nums.length - 1;

        // Last occurrence
        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                last = mid;
                start = mid + 1;
            }
            else if (nums[mid] < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }

        return new int[]{first, last};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int nums[] = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int ans[] = searchRange(nums, target);

        System.out.println(Arrays.toString(ans));
      

    
    }
}
