class Solution {
    public int findChampion(int[][] grid) {
        int max = 0;
        int sum = 0;
        int ind = 0;
        for(int i =0;i<grid.length;i++){
            sum = 0;
            for(int j=0;j<grid[i].length;j++){
                sum += grid[i][j];
            }
            if(sum>max){
                max = sum;
                ind = i;
            }
        }
        return ind;
    }
}