class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int num[]=new int[2];
        HashMap<Integer,Integer>hs=new HashMap<>();
        for(int i=0;i<numbers.length;i++)
        {
            int n=target-numbers[i];
            if(hs.containsKey(n))
            {
                num[0]=hs.get(n)+1;
                num[1]=i+1;
                return num;
            }
            hs.put(numbers[i],i);
        }
        return num;
        
    }
}
