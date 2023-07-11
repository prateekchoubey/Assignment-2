class Solution7 {
    public boolean isMonotonic(int[] nums) {
        int len=nums.length-1;
        if(nums[0]>nums[len])
        {
            for(int i=0;i<len;i++)
            {
                if(nums[i]<nums[i+1])
                return false;
            }
        }
        else
        {
            for(int i=0;i<len;i++)
            {
                if(nums[i]>nums[i+1])
                return false;
            }
        }
        return true;
    }
}