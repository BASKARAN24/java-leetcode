class Solution {
    public int divisorSubstrings(int num, int k) {
        String s = num+"";
        int a = 0;
        String sub = "";
        int count = 0;
        for(int i=0;i<=s.length()-k;i++){
            sub = s.substring(i,i+k);
            a = Integer.parseInt(sub);
            if(a != 0 && num%a == 0)count++;
        }
        return count;
    }
}