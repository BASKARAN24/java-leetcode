class Solution {
    public int vowelConsonantScore(String s) {
        int c = 0;
        int v = 0;
        for(char ch:s.toCharArray()){
            if(isVowel(ch))v++;
            else if(isConsonant(ch)) c++;
        }
        if(c == 0)return 0;
        return (int)Math.floor(v/c);
    }
    public static boolean isVowel(char ch){
        if(ch == 'a' || ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u')return true;
        return false;
    }
    public static boolean isConsonant(char ch){
        String s = "bcdfghjklmnpqrstvwxyz";
        if(s.indexOf(ch) != -1)return true;
        return false;
    }
}