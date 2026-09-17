class Solution {
    public int differenceOfSum(int[] nums) {
        int a = 0;
        int b = 0;
        for(int i:nums){
            a += i;
        }
        for(int i:nums){
            if(i<10)b +=i;
            else {
                while(i != 0){
                    int rem = i%10;
                    b += rem;
                    i /= 10;
                }
            }
        }
        return a - b;
    }
}