class Solution {
    public boolean detectCapitalUse(String word) {
        int l_count = 0;
        int u_count = 0;
        for(int ch:word.toCharArray()){
            if(ch < 97)u_count++;
            else l_count++;
        }
        if(l_count == word.length() || u_count == word.length())return true;
        int a = word.charAt(word.length()-1);
        if(a<96)return false;
        a = word.charAt(0);
        if(a>96)return false;
        for(int i=1;i<word.length()-1;i++){
            a = word.charAt(i);
            if(a <96)return false;
        }
        return true;
    }
}