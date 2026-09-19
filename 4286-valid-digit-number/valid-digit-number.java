class Solution {
    public boolean validDigit(int n, int x) {
        String s1 = n+"";
        String s2 = x+"";
        if(s1.indexOf(s2) != -1 && s1.indexOf(s2) != 0)return true;
        return false;
    }
}