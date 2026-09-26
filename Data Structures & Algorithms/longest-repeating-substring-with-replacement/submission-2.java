class Solution {
    public int characterReplacement(String s, int k) {
        int longest = 0;
        int window = 0;
        int l = 0;
        int r = 0;
        int[] freqs = new int[26];

        while(r < s.length()){
            window = r - l + 1;
            // first, update freq from new character
            freqs[s.charAt(r)-'A'] = freqs[s.charAt(r)-'A']+1;
            // then check window - mostFreq
            // find most frequent
            int max = 0; 
            for(int i : freqs){
                max = Math.max(max, i);
            }

            if(window - max > k){
                freqs[s.charAt(l)- 'A'] = freqs[s.charAt(l)-'A']-1;
                l++;
            } else{
                longest = Math.max(longest, window);
            }

            r++;
        }

        return longest;
    }
}
