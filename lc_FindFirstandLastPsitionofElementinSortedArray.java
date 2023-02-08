Find First and Last Position of Element in Sorted Array


class Solution {
    public int[] searchRange(int[] arr, int t) {
        int[] a = new int[2];
        a[0]=-1;
        a[1]=-1;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==t){
            a[0]=i;
            break;}
        }
        for(int i = arr.length-1;i>=0;i--){
            if(arr[i]==t)
            {
                a[1]=i;
                break;
            }
        }
    return a;
    }
}
    
