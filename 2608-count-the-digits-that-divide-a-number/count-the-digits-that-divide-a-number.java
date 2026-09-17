class Solution {
    public int countDigits(int num) {
        int a = num;
        List<Integer> list = new ArrayList<>();
        while(a != 0){
            int rem = a % 10;
            list.add(rem);
            a /= 10;
        }
        int count = 0;
        for(int i:list){
            if(num%i == 0)count++;
        }
        return count;
    }
}