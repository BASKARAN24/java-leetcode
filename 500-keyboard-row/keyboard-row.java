class Solution {
    public String[] findWords(String[] words) {
        String s1 = "QWERTYUIOPqwertyuiop";
        String s2 = "ASDFGHJKLasdfghjkl";
        String s3 = "ZXCVBNMzxcvbnm";
        List<String> list = new ArrayList<>();
        for(String word:words){
            StringBuilder sb = new StringBuilder();
            for(char ch:word.toCharArray()){
                if(s1.indexOf(ch) != -1)sb.append("1");
                else if(s2.indexOf(ch) != -1)sb.append("2");
                else if(s3.indexOf(ch) != -1)sb.append("3");
            }
            String s = sb.toString();
            Set<Character> set = new HashSet<>();
            set.add(s.charAt(0));
            boolean a = true;
            for(char ch:s.toCharArray()){
                if(!set.contains(ch)){
                    a = false;
                    break;
                }
            }
            if(a){
                list.add(word);
            }
        }
        // String[] arr = new String[list.size()];
        // int i = 0;
        // for(String s:list){
        //     arr[i++] = s;
        // }
        return list.toArray(new String[list.size()]);
    }
}