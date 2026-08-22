class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int a = x;
        int sum = 0;
        while(x != 0){
            int rem = x % 10;
            sum += rem;
            x /= 10;
        }
        return a % sum == 0?sum:-1;
    }
}