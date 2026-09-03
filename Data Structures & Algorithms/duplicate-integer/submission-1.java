class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> found = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            if(found.contains(num)){
                return true;
            }
            found.add(num);
        }
        return false;
    }
}