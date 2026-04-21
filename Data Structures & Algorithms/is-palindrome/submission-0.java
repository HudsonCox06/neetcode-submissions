class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]", "");
        str = str.toLowerCase();

        int n = str.length();
        System.out.println(str);

        int k = n-1;
        for(int i = 0; i <= (n/2 -1); i++){
            // if odd, want to stop at index before middle
            if(str.charAt(i) != str.charAt(k)){
                return false;
            }
            k--;
        }

        return true;
    }
}
