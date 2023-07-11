import java.util.Arrays;

class Solution8 {
    public int smallestRangeI(int[] nums, int k) {
        Arrays.sort(nums);
        int first=nums[0];
        int second=nums[nums.length-1];
        int ans=second-first-(2*k);

        if(ans>=0)
        return ans;
        else
        return 0;

    }
}