class Solution {
    public int[] productExceptSelf(int[] nums) {
        int sum=1;
        int n=nums.length;
        int sum2=1;
        int ans[]=new int[nums.length];
        for(int i=0;i<n;i++)
        {
             ans[i]=sum;
             sum*=nums[i];
        }
        for(int i=n-1;i>=0;i--)
        {
            ans[i]*=sum2;
            sum2*=nums[i];
        }
        return ans;
        
    }
}  
