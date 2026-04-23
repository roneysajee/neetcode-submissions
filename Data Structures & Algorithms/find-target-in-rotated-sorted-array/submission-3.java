class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length -1;
         while (l < r) {
            int m = (l + r) / 2;
            if (nums[m] > nums[r]) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        int pivot = l;
       
        int ret = binary(0,pivot -1,nums,target);
        if(ret != -1) return ret;
        return binary(pivot,nums.length-1,nums,target);
        
    }

    private int binary(int l,int r,int[] nums,int t){
        while(l <= r){
            int m = l + (r-l)/2;
            if(nums[m] == t) return m;
            if(t < nums[m]){
                r = m -1;
            }else{
                l = m + 1;
            }
        }
        return -1;
    }
}
