class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int maxLen = 0;
        int startIndex = 0;
        int currLen = 0;

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(set.contains(c)){
                while(set.contains(c)){
                    set.remove(s.charAt(startIndex));
                    startIndex++;
                    currLen--;
                }
            }
            set.add(c);
            currLen++;

            maxLen = Math.max(maxLen, currLen);
        }

        return maxLen;
    }
}
