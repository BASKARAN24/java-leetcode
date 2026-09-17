class Solution {
    public int sumOfMultiples(int n) {
        int count = 0;
        List<Integer> list = new ArrayList<>();
        int i = 1;
        while(i <= n){
            if(i%3 == 0 || i%5 == 0||i%7 == 0)list.add(i);
            i++;
        }
        for(int ii:list)
        {
            count += ii;
        }
        return count;
    }
}