class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length;
        if(n==0)
        {
            return 0;
        }
        int maxArea=Integer.MIN_VALUE;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {   
                int area=((heights[j]>heights[i])?heights[i]:heights[j])*(j-i);
                if(maxArea<area)
                {
                    maxArea=area;
                }
            }
        }
        return maxArea;
    }
}
