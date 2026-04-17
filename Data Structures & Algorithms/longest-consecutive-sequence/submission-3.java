class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return 1;
        HashSet<Integer> numSet = new HashSet<>();
        for(int n : nums){
            numSet.add(n);
        }
        int maxLen = Integer.MIN_VALUE;


        for(int n : nums){
            if(!numSet.contains(n-1)){
                // start of new sequence
                boolean stillGoing = true;
                int curr = n;
                int len = 1;
                while(stillGoing){
                    curr++;
                    if(numSet.contains(curr)){
                        len++;
                    } else{
                        stillGoing = false;
                    }
                }

                maxLen = Math.max(len, maxLen);
            }
        }

        return maxLen;

    }
}
