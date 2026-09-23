class Solution {
    public int maxArea(int[] heights) {
        int maxVolume = 0;
        // volume = min height * distance
        int l = 0;
        int r = heights.length-1;
        while(l < r){
            int volume = Math.min(heights[l],heights[r])*(r-l);
            maxVolume = Math.max(maxVolume, volume);
            if(heights[l] < heights[r]){
                l++;
            } else if(heights[l] > heights[r]){
                r--;
            } else{
                l++;
            }
        }

        return maxVolume;
    }
}
