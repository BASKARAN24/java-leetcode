class Solution {
    public String[] findRelativeRanks(int[] score) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        String[] arr = new String[score.length];
        for(int i:score){
            list.add(i);
            list1.add(i);
        }
        list.sort(Comparator.reverseOrder());
        int c = 1;
        for(int i:list){
            int a = list1.indexOf(i);
            if(c == 1)arr[a] = "Gold Medal";
            else if(c == 2)arr[a] = "Silver Medal";
            else if(c == 3)arr[a] = "Bronze Medal";
            else arr[a] = c+"";
            c++;
        }
        return arr;
    }
}