class Solution {
    public boolean isAnagram(String s, String t) {
        // record occurences using 26 length array
        if(s.length() != t.length()) return false;
        int[] arr = new int[26];

        for(int i = 0; i < s.length(); i++){
            arr[s.charAt(i) - 'a'] = arr[s.charAt(i) - 'a']+1;
            arr[t.charAt(i) - 'a'] = arr[t.charAt(i) - 'a']-1;
        }

        for(int n : arr){
            if(n != 0) return false;
        }
        return true;
    }
}
