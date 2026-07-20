class Solution {
    public String clearDigits(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch:s.toCharArray()){
            int a = ch;
            if(a>=65){
                stack.push(ch);
            }
            else {
                if(!stack.isEmpty()){
                    stack.pop();
                }
                }

        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        sb = sb.reverse();
        return sb.toString();
    }
}