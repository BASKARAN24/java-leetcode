class Solution {
    public int maximum69Number (int num) {
        String s = num+"";
        StringBuilder sb = new StringBuilder();
        boolean isFirst = true;
        for(char ch:s.toCharArray()){
            if(ch == '6'  && isFirst){
                sb.append("9");
                isFirst = false;
            }
            else sb.append(ch);
        }
        return Integer.parseInt(sb.toString());
    }
}