class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int l = 0,r = 0;
        int[] ret = new int[temperatures.length];
    
        while(l < temperatures.length - 1){
            int count = 0;
            r = l +1;
            while(r < temperatures.length){
                if(temperatures[r] > temperatures[l]){
                    count = r - l;
                    break;
                }
                r++;
            }
            ret[l] = count;
            l++;
        }

        return ret;
    }
}
