
class Solution {
    public int minGroups(int[][] intervals) {
        int[] arr= new int[intervals.length];
        int[] brr= new int[intervals.length];
        for(int i = 0;i<intervals.length;i++){
            arr[i] = intervals[i][0];
            brr[i] = intervals[i][1];
        }
        Arrays.sort(arr);
        Arrays.sort(brr);
        int id = 0;
        for(int i = 0;i<intervals.length;i++){
            if(arr[i]>brr[id]){
                id++;
            }
        }
        return intervals.length-id;

    }
}
