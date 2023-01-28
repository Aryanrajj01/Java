class Solution {
    public int search(int[] arr, int t) {
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == t){
                return i;
            }
            
        }
        return -1;
    }
}
