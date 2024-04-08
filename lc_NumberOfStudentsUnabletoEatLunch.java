class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int cs = 0;
        int ss = 0;
        for(int c:  students){
            if(c==0){
                cs++;
            }
            else{
                ss++;
…                cs--;
            }
            else{
                ss--;
            }
        }
        return 0;
    }
}
