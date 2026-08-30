class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        List<Integer> list = new ArrayList<>();
        List<Integer> templist = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:arr1){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i:arr2){
            int count = map.get(i);
            while(count > 0){
                list.add(i);
                count--;
            }
        }
        for(int i:arr1){
            if(!list.contains(i) && !templist.contains(i))templist.add(i);
        }
        if(templist.size() == 0){
            int[] arr = new int[list.size()];
            int ind = 0;
            for(int i:list){
                arr[ind++] = i;
            }
            return arr;
        }
        Collections.sort(templist);
        for(int i:templist){
            int count = map.get(i);
            System.out.println(i);
            System.out.println(count);
            System.out.println();
            while(count > 0){
                list.add(i);
                count--;
            }
        }
        //Collections.sort(list);
        int[] arr = new int[list.size()];
            int ind = 0;
            for(int i:list){
                arr[ind++] = i;
            }
        return arr;
    }
}