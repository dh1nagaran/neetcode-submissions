class Solution {
    public boolean isAnagram(String s, String t) {
      if(s.length()!=t.length())return false;
      HashMap<Character,Integer>hs1=new HashMap<>();
      HashMap<Character,Integer>hs2=new HashMap<>();
      for(int i=0;i<s.length();i++)
      {
        hs1.put(s.charAt(i),hs1.getOrDefault(s.charAt(i), 0) + 1);
        hs2.put(t.charAt(i),hs2.getOrDefault(t.charAt(i), 0) + 1);
      }

      return hs1.equals(hs2);


    }
}
