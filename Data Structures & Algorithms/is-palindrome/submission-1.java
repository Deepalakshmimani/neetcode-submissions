class Solution {
    public boolean isPalindrome(String s) {
        
        s=s.toLowerCase();
        String rev=new StringBuilder(s).reverse().toString();
        


        int l=0;
        int r=0;
        int n=s.length();

        while(l<n && r<n)
        {   
            char ch1=s.charAt(l);
            char ch2=rev.charAt(r);
            if(Character.isLetterOrDigit(ch1) && Character.isLetterOrDigit(ch2))
            {
                if(ch1!=ch2)
                {
                    return false;
                }
                else
                {
                    r++;
                    l++;
                }
            }
            if(!Character.isLetterOrDigit(ch1))
            {
                l++;
            }
            if(!Character.isLetterOrDigit(ch2))
            {
                r++;
            }
        }

        while(l<n)
        {
            if(Character.isLetterOrDigit(s.charAt(l)))
            {
                return false;
            }
            l++;
        }

         while(r<n)
        {
            if(Character.isLetterOrDigit(rev.charAt(r)))
            {
                return false;
            }
            r++;
        }

        return true;
    }
}
