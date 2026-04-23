class Solution {
    public int maxArea(int[] heights) {
        int volume = 0;

        for(int i =0;i < heights.length-1; i++){
            for(int j = i+1;j<heights.length;j++){
                int tempVol = (j-i)* Math.min(heights[i],heights[j]);
                volume = Math.max(volume,tempVol);
            }
        }

        return volume;
    }
}
