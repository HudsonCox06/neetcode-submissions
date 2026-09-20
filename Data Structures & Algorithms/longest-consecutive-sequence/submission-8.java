class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        Arrays.sort(nums);

        int longestSequence = 1;
        int currentLen = 1;
        int prev = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == prev){
                continue;
            }
            if(nums[i] == prev+1){
                currentLen++;
                prev = nums[i];
                longestSequence = Math.max(longestSequence, currentLen);
                continue;
            } else{
                longestSequence = Math.max(longestSequence, currentLen);
                currentLen = 1;
                prev = nums[i];
            }


        }
        return longestSequence;
    }
}
