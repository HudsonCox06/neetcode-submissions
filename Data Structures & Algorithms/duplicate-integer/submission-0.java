class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> numsFound = new HashSet<>();
        for(int n : nums){
            if(numsFound.contains(n)){
                return true;
            } else{
                numsFound.add(n);
            }
        }

        return false;
    }
}