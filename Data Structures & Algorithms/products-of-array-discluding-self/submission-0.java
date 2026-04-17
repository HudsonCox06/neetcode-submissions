class Solution {
    public int[] productExceptSelf(int[] nums) {
        // at each index, store product sum up to that index
        int n = nums.length;
        int[] output = new int[n];

        int[] prefix = new int[n];
        prefix[0] = 1;
        int[] suffix = new int[n];
        suffix[n-1] = 1;

        int k = n-2;
        for(int i = 1; i<n; i++){

            prefix[i] = prefix[i-1] * nums[i-1];
            suffix[k] = suffix[k+1] * nums[k+1];

            k--;
        }

        output[0] = suffix[0];
        for(int i = 1; i<n; i++){
            output[i] = prefix[i] * suffix[i];
        }

        return output;
    }
}  
