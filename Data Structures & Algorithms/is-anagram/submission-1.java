class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<String, Integer> set1 = new HashMap<>();
        HashMap<String, Integer> set2 = new HashMap<>();
        if(s.length() != t.length()){
            return false;
        }

        for(int i = 0; i < s.length(); i++){
            String c = s.substring(i, i+1);
            if(set1.containsKey(c)){
                set1.put(c, set1.get(c)+1);
            } else{
                set1.put(c, 1);
            }
        }

        for(int i = 0; i < t.length(); i++){
            String c = t.substring(i, i+1);
            if(set2.containsKey(c)){
                set2.put(c, set2.get(c)+1);
            } else{
                set2.put(c, 1);
            }
        }

        if(set1.equals(set2)){
            return true;
        }

        return false;
    }
}
