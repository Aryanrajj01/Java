class Solution {
    public boolean winnerOfGame(String colors) {
        int acon = 0,a=0,bcon=0,b=0;
        for(char c : colors.toCharArray()){
            if(c=='A'){
                bcon=0;
                acon++;
                if(acon>=3){
                    a++;
                }
            }
            else{
                acon=0;
                bcon++;
                if(bcon>=3){
                    b++;
                }
            }
        }
        return a>b;
    }
}
