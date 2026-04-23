class Solution {
    public int maxArea(int[] heights) {
        int volume = 0;
        int l,r;
        l = 0;
        r = heights.length-1;
        
        while(l<r){
            int temp = (r-l) * Math.min(heights[l],heights[r]);
            volume = Math.max(temp,volume);
            if(heights[l] < heights[r]){
                l++;
            } else if(heights[l] > heights[r]){
                r--;
            }else{
                l++;
                r--;
            }
             
        }

        return volume;
    }
}
