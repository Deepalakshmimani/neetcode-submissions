class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1=s1.length();
        int n2=s2.length();
        if(n1>n2) return false;

        char []arr1=new char[26];
        char []arr2=new char[26];
        int j=0;

        for(int i=0;i<n1;i++)
        {   
            char ch=s1.charAt(i);
            arr1[ch-'a']+=1;
        }
        for(int i=0;i<n1;i++)
        {   
            char ch=s2.charAt(i);
            arr2[ch-'a']+=1;
        }

        if(Arrays.equals(arr1,arr2))
            {
                return true;
            }

        for(int i=n1;i<n2;i++)
        {
            if(Arrays.equals(arr1,arr2))
            {
                return true;
            }

            arr2[s2.charAt(j)-'a']-=1;
            arr2[s2.charAt(i)-'a']+=1;
            j++;


        }
        if(Arrays.equals(arr1,arr2))
            {
                return true;
            }
        return false;
    }
}
