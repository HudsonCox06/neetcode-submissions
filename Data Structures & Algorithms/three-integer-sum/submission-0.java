class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // two hashmaps
        // one pairing value to index
        // another with value mapped to pair indexes
        HashSet<List<Integer>> map = new HashSet<>();
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);
        for(int i = 0; i < nums.length-2; i++){
            int target = -nums[i];
            int l = i+1;
            int r = nums.length-1;
            while(l < r){
                if(nums[l] + nums[r] == target){
                    Integer[] newSol = new Integer[3];
                    newSol[0] = nums[i];
                    newSol[1] = nums[l];
                    newSol[2] = nums[r];
                    if(!map.contains(Arrays.asList(newSol))){
                        map.add(Arrays.asList(newSol));
                        ans.add(Arrays.asList(newSol));
                    }

                }

                if(nums[l] + nums[r] > target){
                    r--;
                } else{
                    l++;
                }
            }
        }

        return ans;
    }
}
