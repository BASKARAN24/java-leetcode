class Solution {
    public int maxProduct(int n) {
        List<Integer> list = new ArrayList<>();
        while(n != 0){
            int rem = n%10;
            list.add(rem);
            n /= 10;
        }
        int max = Integer.MIN_VALUE;
        for(int i=0;i<list.size()-1;i++){
            for(int j=i+1;j<list.size();j++){
                max = Math.max(max,list.get(i)*list.get(j));
            }
        }
        return max;
    }
}