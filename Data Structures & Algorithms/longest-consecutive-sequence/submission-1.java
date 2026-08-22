class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int max=0;
        int count=1;
        int n=nums.length;
        if(n==0)return 0;
        for(int i=1;i<n;i++)
        {
            if(nums[i]-nums[i-1]==0)continue;
            else if(nums[i]-nums[i-1]>1)
            {
                max=Math.max(count,max);
                count=1;
            }
            else count++;
        }
        max=Math.max(count,max);
        return max;
    }
}
