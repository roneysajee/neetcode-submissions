class Solution {
    public int lengthOfLongestSubstring(String s) {
        int length = 0;
        int l=0, r = 0;
        if(s.length() == 0) return 0;
        if(s.length() == 1) return 1;
        Set<Character> set = new HashSet<>();
       
        while(l <= s.length() -1){
            set.add(s.charAt(l));
            for(r= l+1;r<s.length();r++){
                if(!set.contains(s.charAt(r))){
                    set.add(s.charAt(r));
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
