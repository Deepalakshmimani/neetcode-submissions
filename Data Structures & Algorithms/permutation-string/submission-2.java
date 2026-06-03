class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1=s1.length();
        int n2=s2.length();

        char[] ans=s1.toCharArray();
        Arrays.sort(ans);
        s1=new String(ans);
        

        for(int i=0;i<=n2-n1;i++)
        {   
            
            String str=s2.substring(i,i+n1);
            char[] chars=str.toCharArray();
            Arrays.sort(chars);
            str=new String(chars);
            if(s1.equals(str))
            {
                return true;
            }
        }

        return false;
    }
}
