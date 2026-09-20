class Solution {
    public int[] productExceptSelf(int[] nums) {
        // prefix and postfix sum
        int n = nums.length;
        int[] prefix = new int[n];
        prefix[0] = 0;
        prefix[1] = nums[0];
        int[] postfix = new int[n];
        postfix[n-1] = 0;
        postfix[n-2] = nums[n-1];
        // prefix[i] = product of all digits before that index
        // postfix[i] = product of all digits after that index

        for(int i = 2; i < n; i++){
            prefix[i] = prefix[i-1] * nums[i-1];
        }
        for(int i = n-3; i >= 0; i--){
            postfix[i] = postfix[i+1] * nums[i+1];
        }
        
        int[] output = new int[n];
        output[0] = postfix[0];
        output[n-1] = prefix[n-1];
        for(int i = 1; i < n-1; i++){
            output[i] = prefix[i] * postfix[i];
        }
        return output;
    }
}  
