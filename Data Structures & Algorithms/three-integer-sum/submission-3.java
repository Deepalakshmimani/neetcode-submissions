class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;

        List<List<Integer>> list=new ArrayList<>();

        for(int i=0;i<n-1;i++)
        {
            int left=i+1;
            int right=n-1;
            if(i>0&&nums[i]==nums[i-1]) continue;

            while(left<n && right>i && left<right)
            {
                if(nums[i]+nums[left]+nums[right]==0)
                {
                    list.add(new ArrayList<>(Arrays.asList(nums[i],nums[left],nums[right])));
                    left++;
                    right--;

                    while(left<right && nums[left]==nums[left-1])
                    {
                        left++;
                    }
                    while(left<right && nums[right]==nums[right+1])
                    {
                        right--;
                    }
                }
                else if(nums[i]+nums[left]+nums[right]<0)
                {
                    left++;
                }
                else
                {
                    right--;
                }

                
            }
        }
        return list;
    }
}
