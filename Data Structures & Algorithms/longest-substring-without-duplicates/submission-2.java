class Solution {
    public int lengthOfLongestSubstring(String s) {
        int length = 0;
        int l=0, r = 0;
        if(s.length() == 0) return 0;
        if(s.length() == 1) return 1;
        Set<Character> set = new HashSet<>();
        char[] arr = s.toCharArray();
       
        while(l <= arr.length -1){
            set.add(arr[l]);
            for(r= l+1;r<arr.length;r++){
                if(!set.contains(arr[r])){
                    set.add(arr[r]);
                }else{
                    break;
                }
            }
            length = Math.max(length,set.size());
            l++;
            set.clear();
        }
        return length;
    }
}
