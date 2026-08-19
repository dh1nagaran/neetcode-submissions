class Solution {
    public boolean hasDuplicate(int[] nums) {
      List<Integer>ls=new ArrayList<>();
      for(int n:nums)
      {
          if(ls.contains(n))return true;
          ls.add(n);
      }
      return false;
        
    }
}