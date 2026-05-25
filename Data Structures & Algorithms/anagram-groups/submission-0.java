class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String,List<String>> map=new HashMap<>();
        
        for(String str:strs)
        {
           char [] chars=str.toCharArray();
           Arrays.sort(chars);
           String s=new String(chars);

           if(!map.containsKey(s))
           {
            map.put(s,new ArrayList<>());
           }
           map.get(s).add(str);
        }

        return new ArrayList<>(map.values());
    }
}
