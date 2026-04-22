class Solution {
    public int maxArea(int[] heights) {
        int maxVol = Integer.MIN_VALUE;
        int n = heights.length;

        for(int i = 0; i < n-1; i++){
            int leftHeight = heights[i];

            for(int k = i+1; k < n; k++){
                int rightHeight = heights[k];

                int volume = Math.min(leftHeight, rightHeight) * (k-i);

                maxVol = Math.max(maxVol, volume);
            }
        }

        return maxVol;
    }
}
