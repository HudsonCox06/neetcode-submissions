class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[]{-1,-1};
        HashMap<Integer, Integer> numMap = new HashMap<>();
        // key = index, value = value
        for(int i = 0; i<nums.length; i++){
            int difference = target - nums[i];
            if (numMap.containsKey(difference)){
                arr = new int[]{numMap.get(difference), i};
                return arr;
            } else{
                numMap.put(nums[i], i);
            }
        }

        return arr;
    }
}
