class Solution {
    public boolean isPalindrome(String s) {
        
        s=s.toLowerCase();
        
        
       
        int n=s.length();
        int l=0;
        int r=n-1;
        

        while(l<r)
        {   
            char ch1=s.charAt(l);
            char ch2=s.charAt(r);
            if(Character.isLetterOrDigit(ch1) && Character.isLetterOrDigit(ch2))
            {
                if(ch1!=ch2)
                {
                    return false;
                }
                else
                {
                    r--;
                    l++;
                }
            }
            if(!Character.isLetterOrDigit(ch1))
            {
                l++;
            }
            if(!Character.isLetterOrDigit(ch2))
            {
                r--;
            }
        }


        return true;
    }
}
