class Solution {
    public void duplicateZeros(int[] arr) {
        int [] arr1 = new int[arr.length];
        int i = 0;
        int ind = 0;
        while(ind < arr1.length && i<arr1.length){
            if(arr[i] == 0){
                arr1[ind++] = 0;
                if(ind < arr.length){
                    arr1[ind++] = 0;
                }
            }
            else arr1[ind++] = arr[i];
            i++;
        }
        i = 0;
        for(int ii:arr1){
            arr[i] = ii;
            i++;
        }
    }
}