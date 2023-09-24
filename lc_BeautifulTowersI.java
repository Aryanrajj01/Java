class Solution {
    public long maximumSumOfHeights(List<Integer> arr) {
        long res = 0;
        for(int id = 0;id<arr.size();id++){
            long ans = arr.get(id);
            long las = arr.get(id);
            for(int i = id-1;i>=0;i--){
                las=Math.min(arr.get(i),las);
                ans+=las;
            }
            las=arr.get(id);
            for(int i = id+1;i<arr.size();i++){
                las = Math.min(arr.get(i),las);
                ans+=las; 
            }
            res =Math.max(ans,res);
        }
        return res;
    }
}
