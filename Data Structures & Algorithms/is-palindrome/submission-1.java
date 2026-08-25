class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]", "");
       StringBuilder t=new StringBuilder(s);
        return s.equalsIgnoreCase(t.reverse().toString());
        
    }
}
