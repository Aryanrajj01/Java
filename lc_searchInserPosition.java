class Solution {
    public int searchInsert(int[] arr, int t) {    
    int s = 0;
    while(s<arr.length){
    if(arr[s] == t){
        return s;
    }
    if(arr[s]>t){
        return s;
    }
    s++;
    }
    return arr.length;   
    }
}
