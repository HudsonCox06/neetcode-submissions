class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       HashMap<String, List<String>> map = new HashMap<>();

       for(String str : strs){
            int[] occurArray = new int[26];
            for(char c : str.toCharArray()){
                occurArray[c-'a']++;
            }

            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < occurArray.length; i++){
                if(occurArray[i] != 0){
                    sb.append((char)('a' + i)).append(occurArray[i]);
                }
            }
            String key = sb.toString();

            map.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
       }

        return new ArrayList<>(map.values());
    }
}
