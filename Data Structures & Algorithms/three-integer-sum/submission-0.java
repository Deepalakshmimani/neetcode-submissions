class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;

        
        HashSet<List<Integer>> set=new HashSet<>();

        for(int i=0;i<n-1;i++)
        {
            int left=i+1;
            int right=n-1;

            while(left<n && right>i && left<right)
            {
                if(nums[i]+nums[left]+nums[right]==0)
                {
                    set.add(new ArrayList<>(Arrays.asList(nums[i],nums[left],nums[right])));
                    left++;
                    right--;
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
        return new ArrayList<>(set);
    }
}
