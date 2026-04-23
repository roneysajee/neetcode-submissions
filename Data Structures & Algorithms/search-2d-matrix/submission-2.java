class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int i;
        for(i =0; i< rows;i++){
            int[] arr = matrix[i];
            if(target == arr[arr.length-1]) return true;
            if(target < arr[arr.length-1]) break;
        }

        if(i>= rows){
            return false;
        }else{
            return binarySearch(0,matrix[i].length-1,matrix[i],target);
        }
    }

    private boolean binarySearch(int l, int r, int[] nums,int target){
        if(l > r) return false;
        int m = l + (r -l)/2;

        if(nums[m] == target) return true;
        return (nums[m] > target)? binarySearch(l,m-1,nums,target) :
         binarySearch(m+1,r,nums,target);
    }
}
