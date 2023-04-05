class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length<3){
            return false;
        }
        int i = 0, a = arr.length-1;
        while(i+1 < a && arr[i] < arr[i+1]){
            i++;
        }
        while(a-1>0 && arr[a] < arr[a-1]){
            a--;
        }
        return i==a;
    }
}
