class Solution {
    public int romanToInt(String s) {

        int prev = 0;
        int ans = 0;
        for(int i = s.length()-1;i>=0;i--){
            char ch = s.charAt(i);
            int sum = 0;
            if(ch == 'I')sum += 1;
            else if(ch == 'V')sum += 5;
            else if(ch == 'X')sum += 10;
            else if(ch == 'L')sum += 50;
            else if(ch == 'C')sum += 100;
            else if(ch == 'D')sum += 500;
            else if(ch == 'M')sum += 1000;
            if(sum < prev)ans -= sum;
            else ans += sum;
            prev = sum;
        }
        return ans;
    }
}