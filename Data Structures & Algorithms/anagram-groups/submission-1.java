class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> anagrams = new HashMap<>();
    
        for(int i = 0; i < strs.length; i++){
            // use 26 length array as key
            int[] occurs = new int[26];
            String str = strs[i];
            for(char c : str.toCharArray()){
                occurs[c-'a']++;
            }
            String key = Arrays.toString(occurs);
            anagrams.putIfAbsent(key, new ArrayList<>());
            anagrams.get(key).add(str);
        }
        
       return new ArrayList<>(anagrams.values());
    }
}
