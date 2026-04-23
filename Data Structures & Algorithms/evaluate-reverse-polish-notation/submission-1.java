class Solution {
    public int evalRPN(String[] tokens) {
        int ret = 0;
        Stack<Integer> stack = new Stack<>();

        for(String s : tokens){
            if("+".equals(s) || "-".equals(s) || "*".equals(s) || "/".equals(s)){
                
                int b = stack.pop();
                    int a = stack.pop();
                    int temp = calculate(a,b,s);
                    stack.push(temp);
            }else{
                stack.push(Integer.valueOf(s));
                
                    
                
            }
        }

        return stack.pop();
    }

    private int calculate(int a, int b,String operand){
        if("+".equals(operand)){
            return a + b;
        }else if("-".equals(operand)){
            return a- b;
        }else if("*".equals(operand)){
            return b * a;
        }else{
            return (int)Math.floor(a/ b);
        }
    }
}
