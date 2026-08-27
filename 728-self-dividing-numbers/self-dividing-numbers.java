class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        while(left<=right){
            int a = left;
            String s = left+"";
            if(s.indexOf('0') == -1){
                boolean ans = true;
            while(a != 0){
                int rem = a % 10;
                if(left % rem != 0 ){
                    ans = false;
                    break;
                }
                a /= 10;
            }
            if(ans){
                list.add(left);
            }
            }
            left++;
        }
        return list;
    }
}