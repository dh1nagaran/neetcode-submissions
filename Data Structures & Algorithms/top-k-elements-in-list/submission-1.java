class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int ans[]=new int[k];
        HashMap<Integer,Integer>hs=new HashMap<>();
        TreeMap<Integer,TreeSet<Integer>>ts=new TreeMap<>( Collections.reverseOrder());
        int count=0;
        for(int n:nums) hs.put(n,hs.getOrDefault(n,0)+1);
        for(int n:hs.keySet())
        {
            ts.computeIfAbsent(hs.get(n), h -> new TreeSet<>()).add(n);
        }
        for(int n:ts.keySet())
        {
            TreeSet<Integer>t=new TreeSet<>();
            t=ts.get(n);
            for(int m:t){
                if(count==k)break;
                else ans[count++]=m;
            }
            if(count>=k)break;
        }  
        return ans;

        
    }
}
