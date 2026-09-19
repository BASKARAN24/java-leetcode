class Solution {
    public int[] scoreValidator(String[] events) {
        int[] arr = new int[2];
        int score = 0;
        int counter = 0;
        for(String s:events){
            if(counter == 10){
                arr[0] = score;
                arr[1] = counter;
                return arr;
            }
            if(s.equals("W"))counter++;
            else if(s.equals("WD"))score++;
            else if(s.equals("NB"))score++;
            else{
                int a = Integer.parseInt(s);
                score += a;
            }
        }
        arr[0] = score;
        arr[1] = counter;
        return arr;
    }
}