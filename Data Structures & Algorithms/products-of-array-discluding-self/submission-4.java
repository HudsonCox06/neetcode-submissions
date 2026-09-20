class Solution {
    public int[] productExceptSelf(int[] nums) {
        // prefix and postfix sum
        int n = nums.length;
        int[] prefix = new int[n];
        prefix[0] = 1;
        int[] postfix = new int[n];
        postfix[n-1] = 1;
        // prefix[i] = product of all digits before that index
        // postfix[i] = product of all digits after that index

        for(int i = 1; i < n; i++){
            prefix[i] = prefix[i-1] * nums[i-1];
        }
        for(int i = n-2; i >= 0; i--){
            postfix[i] = postfix[i+1] * nums[i+1];
        }
        
        int[] output = new int[n];
        for(int i = 0; i < n; i++){
            output[i] = prefix[i] * postfix[i];
        }
        return output;
    }
}  
