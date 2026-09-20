class Solution {
    public int lengthOfLongestSubstring(String s) {
        // hashmap
        HashSet<Character> chars = new HashSet<>();
        int maxLen = 0;
        int l = 0;
        int len = 0;

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            while(chars.contains(c)){
                chars.remove(s.charAt(l));
                l++;
            }
            chars.add(c);
            len = i-l+1;
            maxLen = Math.max(maxLen, len);

        }

        return maxLen;
    }
}
