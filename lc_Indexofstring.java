class Solution {
    public int strStr(String h, String n) {
        for(int i = 0;;i++){
            for(int j = 0;;j++){
                if(j==n.length()){
                    return i;
                }
                else if(i+j == h.length()){
                    return -1;
                }
                else if(n.charAt(j)!= h.charAt(i+j)){
                break;                    
                }
            }
        }


    }
} 


// 2nd Method 
class Solution {
    public int strStr(String h, String n) {
        return  h.indexOf(n);
    }
}
