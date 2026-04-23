class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = 0,n = 0;
        int[] combined = new int[nums1.length + nums2.length];
        int i = 0;
        while(m < nums1.length && n < nums2.length){
            if(nums1[m]<nums2[n]){
                combined[i] = nums1[m];
                m++;
            }else if(nums1[m] > nums2[n]){
                combined[i] = nums2[n];
                n++;
            }else{
                combined[i++] = nums1[m];
                combined[i] = nums2[n];
                m++;
                n++;
            }
            i++;
        }
        while(m < nums1.length){
            combined[i++] = nums1[m];
            m++;
        }

        while(n < nums2.length){
            combined[i++] = nums2[n];
            n++;
        }
        if(combined.length == 0) return 0.0;
        int len = nums1.length + nums2.length;
        System.out.println(Arrays.toString(combined));
        if(len % 2 == 0){
            return (combined[(len/2 -1 )] + combined[len/2])/2.0;
        }else{
            return(combined[len/2]);
        }
    }
}
