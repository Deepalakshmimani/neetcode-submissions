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

        List<List<String>> list=new ArrayList<>();
        for(List<String> l:map.values())
        {
            list.add(l);
        }
        return list;
    }
}
