class Solution {
    public boolean isValid(String word) {
        List<Integer> list = new ArrayList<>();
        if(word.length()<3)return false;
        String voword = word.replaceAll("[aeiouAEIOU]","");
        if(voword.length()==word.length())return false;
        if(voword.length()==0)return true;
        String consword = voword.replaceAll("[a-zA-Z]","");
        if(consword.length() == voword.length())return false;
        for(char ch:consword.toCharArray()){
            int a = ch;
            if(a >57 || a<48)return false;
        }
        return true;
    }
}