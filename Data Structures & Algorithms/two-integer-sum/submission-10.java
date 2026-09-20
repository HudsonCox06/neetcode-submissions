class Solution {
    public int[] twoSum(int[] nums, int target) {
        // O(n) solution using hashMap
        HashMap<Integer, Integer> map = new HashMap<>();
        // key is value, value is index
        int[] sol = new int[2];

        for(int i = 0; i < nums.length; i++){
            
            if(map.containsKey(target-nums[i])){
                sol[1] = i;
                sol[0] = map.get(target-nums[i]);
                return sol;
            } 
            map.put(nums[i], i);
        }
        return sol;
    }
}
