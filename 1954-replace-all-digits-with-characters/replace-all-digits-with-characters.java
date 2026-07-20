class Solution {
    public String replaceDigits(String s) {
        if(s.length()==1){
            int a = s.charAt(0);
            if(a>=65)return s;
        }
        int len = 0;
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<s.length();i=i+2){
            int a = s.charAt(i-1);
            int b = a+Integer.parseInt(s.charAt(i)+"");
            sb.append(s.charAt(i-1));
            sb.append((char)b);
            len = i;
        }
        if(len == s.length()-1){
            return sb.toString();
        }
        sb.append(s.charAt(s.length()-1));
        return sb.toString();
    }
}