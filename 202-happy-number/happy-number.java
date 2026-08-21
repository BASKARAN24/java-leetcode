class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        int sum = 0;
        while(sum != 1){
            int a = n;
            sum = 0;
            while(n != 0){
                int rem = n % 10;
                sum += rem * rem;
                n /= 10;
            }
            n = sum;
            if(sum == 1)return true;
            if(set.contains(sum))return false;
            set.add(sum);
        }
        return false;
    }
}