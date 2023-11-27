class Solution {
    public List<Integer> findWordsContaining(String[] w, char x) {
        List<Integer> lst = new ArrayList<>();
        int i = 0;
        for(String s:w){
            if(s.indexOf(x)!=-1){
                lst.add(i);
            }
            i++;
        }
        return lst;
    }
}
