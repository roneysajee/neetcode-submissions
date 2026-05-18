class Solution {
    public int findDuplicate(int[] nums) {
       
       for(int i =0;i< nums.length;i++){
        int mapIndex = Math.abs(nums[i]) - 1;
        if(nums[mapIndex] < 0){
            return Math.abs(nums[i]);
        }else{
            nums[mapIndex] *= -1 ;
        }
       } 
       return 0;
    }
}
