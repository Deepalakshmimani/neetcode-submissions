class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length;
        if(n==0)
        {
            return 0;
        }
        int maxArea=Integer.MIN_VALUE;
        int leftPointer=0;
        int rightPointer=n-1;
        int width;
        int height;
        while(leftPointer<rightPointer)
        {   

            width=rightPointer-leftPointer;

            if(heights[leftPointer]>heights[rightPointer])
            {
                height=heights[rightPointer];
                rightPointer--;
            }
            else if(heights[leftPointer]<heights[rightPointer])
            {
                height=heights[leftPointer];
                leftPointer++;
            }
            else
            {   
                height=heights[rightPointer];

                leftPointer++;
                rightPointer--;
            }
          
            if(maxArea<(width*height))
            {
                maxArea=width*height;

            }
           
           
        }
        return maxArea;
    }
}
