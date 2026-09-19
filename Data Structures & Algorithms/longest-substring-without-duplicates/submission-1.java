class Solution {
    public int lengthOfLongestSubstring(String s) {
        int index;
        int window = 0;
        int maxLength = 0;
        HashSet<Character> set = new HashSet<>();
        int l = 0;
        int r = 0;
        for(int i = 0; i < s.length(); i++){
            Character c = s.charAt(i);
            while(set.contains(c)){
                // increment l and remove from hashSet
                set.remove(s.charAt(l));
                l++;
            }

            set.add(c);
            r++;
            maxLength = Math.max(maxLength, r-l);
        }

        return maxLength;
    }
}
