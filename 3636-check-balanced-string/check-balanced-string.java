class Solution {
    public boolean isBalanced(String num) {
        int odd_sum = 0;
        int even_sum = 0;
        for(int i=0;i<num.length();i++){
            int a = num.charAt(i)-'0';
            if(i%2==0)even_sum += a;
            else odd_sum += a;
        }
        return odd_sum == even_sum;
    }
}