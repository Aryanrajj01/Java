class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int a = nums1[0];
        int b = nums2[0];
        for(int i:nums1){
            for(int j:nums2){
                if(i==j){
                    return i;
                }
                if(j>i){
                    break;
                }
            }
        }
        if(a<b){
            return a*10 + b;
        }
        return b*10 + a;
    }
}
