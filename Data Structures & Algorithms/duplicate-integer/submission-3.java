class Solution {
    public boolean hasDuplicate(int[] nums) {
      Hashtable<Integer,Integer>ls=new Hashtable<>();
      for(int i=0;i<nums.length;i++)
      {
          if(ls.containsKey(nums[i]))return true;
          ls.put(nums[i],i);
      }
      return false;
    }
}