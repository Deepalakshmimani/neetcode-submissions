class Solution {
    public int longestConsecutive(int[] nums) {
        
        int n=nums.length;
        HashSet<Integer> map=new HashSet<>();
        int minValue=Integer.MAX_VALUE;
        int maxValue=Integer.MIN_VALUE;
        int maxCount=0;
        int count=0;

        for(int i=0;i<n;i++)
        {
            map.add(nums[i]);
            if(minValue>nums[i])
            {
                minValue=nums[i];
            }

             if(maxValue<nums[i])
            {
                maxValue=nums[i];
            }
        }

        for(int i=minValue;i<=maxValue;i++)
        {
            if(map.contains(i))
            {
                count++;
            }
            else
            {
                
                count=0;
                if(n-maxCount<=maxCount)
                {
                    break;
                }
            }

            if(maxCount<count)
            {
                maxCount=count;
            }
            
            
        }

        return maxCount;


    }
}
