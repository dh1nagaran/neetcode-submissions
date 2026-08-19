class Solution {
    public boolean hasDuplicate(int[] nums) {
      Hashtable<Integer,Integer>ls=new Hashtable<>();
      for(int n:nums)
      {
          if(ls.containsKey(n))return true;
          ls.put(n,n);
      }
      return false;
    }
}