class Solution {
    public int[] twoSum(int[] nums, int target) {
        // O(n) solution using hashMap
        HashMap<Integer, Integer> map = new HashMap<>();
        // key is value, value is index
        int[] sol = new int[2];

        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], i);
        }

        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(target-nums[i]) && map.get(target-nums[i]) != i){
                sol[0] = i;
                sol[1] = map.get(target-nums[i]);
                return sol;
            } 
        }
        return sol;
    }
}
