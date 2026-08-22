class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int min = Integer.MAX_VALUE;
        char c = 'a';
        int a = target;
        for(int ch:letters){
                if(ch>a){
                    if(Math.abs(a-ch)<min){
                        c = (char)ch;
                        min = Math.abs(a-ch);
                    }
                    
                }
                
        }
        return c=='a'?letters[0]:c;
    }
}