class Solution {
    public boolean checkGoodInteger(int n) {
        int a = n;
        int digitSum = 0;
        int squareSum = 0;
        while(n != 0){
            int rem = n%10;
            digitSum += rem;
            n /= 10;
        }
        while(a != 0){
            int rem = a%10;
            squareSum += rem * rem;
            a /= 10;
        }
        return (squareSum - digitSum) >= 50;
    }
}