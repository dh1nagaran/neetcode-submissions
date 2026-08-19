class Solution {
    public boolean hasDuplicate(int[] nums) {
      HashSet<Integer>ls=new HashSet<>();
      for(int n:nums)
      {
          if(ls.contains(n))return true;
          ls.add(n);
      }
      return false;
    }
}