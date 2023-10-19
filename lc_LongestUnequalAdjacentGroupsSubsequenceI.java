class Solution {
    public List<String> getWordsInLongestSubsequence(int n, String[] words, int[] groups) {
        List<String> li = new ArrayList<>();
        li.add(words[0]);
        for(int i = 1;i<words.length;i++){
            if(groups[i]!=groups[i-1]){
                li.add(words[i]);
            }
            else{
                continue;
            }
        }
        return li;
    }
}
