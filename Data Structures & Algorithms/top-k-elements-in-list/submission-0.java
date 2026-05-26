class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        PriorityQueue<Map.Entry<Integer,Integer>> pq=new PriorityQueue<>(
            (a,b)-> b.getValue()-a.getValue()
        );

        int [] arr=new int[k];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }

        pq.addAll(map.entrySet());

        for(int i=0;i<k;i++)
        {
            arr[i]=pq.poll().getKey();
        }

        return arr;
    }
}
