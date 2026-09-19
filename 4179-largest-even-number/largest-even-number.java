class Solution {
    public String largestEven(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            int a = Integer.valueOf(s.charAt(i)+"");
            if(a%2==0)return s.substring(0,i+1);
        }
        return "";
    }
}