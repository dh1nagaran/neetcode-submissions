class Solution {
    public boolean isPalindrome(String s) {
        String org="";
        String dupli="";
        for(int i=0;i<s.length();i++)
        {
            if(Character.isDigit(s.charAt(i)) || Character.isLetter(s.charAt(i)))
            {
                org+=s.charAt(i);
            }
        }
        for(int i=org.length()-1;i>=0;i--) dupli+=org.charAt(i);
        return org.equalsIgnoreCase(dupli);
        
        
    }
}
