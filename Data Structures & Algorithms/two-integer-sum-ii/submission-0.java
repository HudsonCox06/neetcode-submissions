class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> nums = new HashMap<>();
        nums.put(numbers[0], 0);

        for(int i = 0; i < numbers.length; i++){
            int solution = target - numbers[i];
            if(nums.containsKey(solution)){
                return new int[]{nums.get(solution)+1, i+1};
            }

            nums.put(numbers[i], i);
        }

        return null;
    }
}
