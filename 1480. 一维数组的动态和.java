// 一次for循环
class Solution {
    public int[] runningSum(int[] nums) {
        int length = nums.length;
        int[] runSum = new int[length];
        runSum[0] = nums[0];
        for (int i=1; i<length; i++) {
            runSum[i] += runSum[i-1] + nums[i];
        }
        return runSum;
    }
}

// 递归的方式
import java.util.Arrays;

public class Leecode {
    public static void main(String[] args) {
        System.out.println();
        int[] nums = {1,2,3,4};
   //     int[] nums = {1,1,1,1};
        int[] res = runningSum(nums);
        System.out.println(Arrays.toString(res));
    }

    public static int[] runningSum(int[] nums) {
        int length = nums.length;
        int[] runSum = new int[length];
        sumArr(runSum, nums, length-1);
        return runSum;
    }
    public static int sumArr(int[] runSum, int[] nums, int index) {
        if (index==0) {
            runSum[0] = nums[0];
            return runSum[index];
        }
        runSum[index] = nums[index] + sumArr(runSum, nums, index-1);
        return runSum[index];
    }
}
