class Solution {
    public boolean isPalindrome(String s) {
        int fPoint = 0;
        int bPoint = s.length() - 1;
        String fStr = "";
        String bStr = "";
        while(fPoint < bPoint){
            if(!Character.isLetterOrDigit(s.charAt(fPoint))){
                while(fPoint < bPoint && !Character.isLetterOrDigit(s.charAt(fPoint))){
                    fPoint++;
                }
            }
            if(!Character.isLetterOrDigit(s.charAt(bPoint))){
                 while(fPoint < bPoint && !Character.isLetterOrDigit(s.charAt(bPoint)) ){
                    bPoint--;
                }
            }
            if(Character.toLowerCase(s.charAt(fPoint)) != Character.toLowerCase(s.charAt(bPoint))){
                return false;
            }
            fPoint++;
            bPoint--;
        }
        return true;
    }
}
