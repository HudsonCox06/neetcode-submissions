class Solution {
    public boolean checkInclusion(String s1, String s2) {
        // get signature of s1, 
        // window of size of s1
        // update signature of s2 substring as window moves
        if(s1.length() > s2.length()) return false;
        int[] s1Sig = new int[26];
        int[] s2Sig = new int[26];
        for(int i = 0; i < s1.length(); i++){
            s1Sig[s1.charAt(i) - 'a']++;
            s2Sig[s2.charAt(i) - 'a']++;
        }

        int l = 0;
        int r = s1.length();

        while(r < s2.length()){
            if(Arrays.equals(s1Sig, s2Sig)) return true;

            // move window
            // update s2Sig
            s2Sig[s2.charAt(l) - 'a']--;
            s2Sig[s2.charAt(r) - 'a']++;

            l++; 
            r++;
        }

        return Arrays.equals(s1Sig, s2Sig);
    }
}
