class Solution {
    public List<List<String>> Anagrams(String[] s) {
        // Code here
        int l=s.length;
        List<List<String>> ans=new ArrayList<List<String>>();
        HashMap<String,List<String>> mp=new HashMap<>();
        for(int i=0;i<s.length;i++){
            char[] ch=s[i].toCharArray();
            Arrays.sort(ch);
            String word=Arrays.toString(ch);
            if(mp.containsKey(word))
            mp.get(word).add(s[i]);
            else{
                List<String> a=new ArrayList<>();
                a.add(s[i]);
                mp.put(word,a);
            }
        }
        for(String x: mp.keySet()){
            List<String> v=mp.get(x);
            ans.add(v);
        }
        return ans;
    }
}
