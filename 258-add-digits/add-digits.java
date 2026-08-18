class Solution {
    public int addDigits(int num) {
        int ans = num;
        String s = num +"";
        while(s.length()>1){
            ans = 0;
            while(num != 0){
            int rem = num % 10;
            ans += rem;
            num /= 10;
        }
        s = ans +"";
        num = ans;
        }
        return ans;
    }
}