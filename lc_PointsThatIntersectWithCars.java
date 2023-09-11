class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        int[] a=new int[101];
        for(int i = 0;i<nums.size();i++){
            for(int j = nums.get(i).get(0);j<=nums.get(i).get(1);j++){
                a[j]++;
            }
        }
        int c=0;
        for(int i:a){
            if(i>0){
                c++;
            }
        }
        return c;
    }
}
