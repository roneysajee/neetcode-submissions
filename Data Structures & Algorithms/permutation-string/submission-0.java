class Solution {
    public boolean checkInclusion(String s1, String s2) { 
        int window = s1.length();
        Map<Character,Integer> map = new HashMap<>();
        for(char c : s1.toCharArray()){
            map.put(c,map.getOrDefault(c,0) + 1);
        }

        for(int l = 0,r = window - 1;r< s2.length();r++,l++){
            Map<Character,Integer> map2 = new HashMap<>();

            for(char c : s2.substring(l,r+1).toCharArray()){
                map2.put(c,map2.getOrDefault(c,0) + 1);
            }
            if(map2.equals(map)) return true;
        }

        return false;
    }
}
