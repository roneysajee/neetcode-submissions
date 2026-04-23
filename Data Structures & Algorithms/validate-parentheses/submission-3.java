class Solution {
    public boolean isValid(String s) {
        Stack<String> stack = new Stack<>();
        boolean ret = true;
        if(s.length() < 2) return false;
        for(String c : s.split("")){
            System.out.println(c);
            if(isOpening(c)){
                stack.push(c);
            }else{
                if(stack.empty()) return false;
                String open = stack.pop();
                if("[".equals(open) && !"]".equals(c)){
                    return false;
                }else if("{".equals(open) && !"}".equals(c)){
                    return false;
                }else if("(".equals(open) && !")".equals(c)){
                    return false;
                }
            }
        }

        if(!stack.empty()) return false;
        return ret;
    }

    private boolean isOpening(String s){
            if(s.equals("{") || s.equals("[") || s.equals("(")){
                return true;
            }else{
                return false;
            }
        }
}
