class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer>hs=new HashMap<>();
        for(int i=0;i<numbers.length;i++)
        {
            int n=target-numbers[i];
            if(hs.containsKey(n))
            {
               return new int[]{hs.get(i)+1,i+1};
            }
            hs.put(numbers[i],i);
        }
        return new int[]{0,0};
        
    }
}
