class Solution {
    public int maxArea(int[] heights) {
        int maxVol = Integer.MIN_VALUE;
        int n = heights.length;

        int i = 0;
        int k = n-1;
        while(i < k){
            int leftHeight = heights[i];
            int rightHeight = heights[k];

            int volume = Math.min(leftHeight, rightHeight) * (k-i);

            maxVol = Math.max(maxVol, volume);

            if (leftHeight < rightHeight){
                // left jump is greater, increment i
                i++;
            } else{
                k--;
            }
        }

        return maxVol;
    }
}
