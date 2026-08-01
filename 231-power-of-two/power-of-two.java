class Solution {
    public boolean isPowerOfTwo(int n) {
        int a = 0;
        int b = 0;
        if((n %10) %2 != 0 && n != 1) return false;
        while(b < n){
            b = (int)Math.pow(2,a);
            if(b == n)return true;
            a++;
        }
        return false;
    }
}