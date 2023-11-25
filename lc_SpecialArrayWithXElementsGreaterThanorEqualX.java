class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int start = 0;
        int end = nums.length;
        while (start <= end) {
            int mid = start + (end - start) /2;
            int count = find(nums,mid);
            if (mid == count) {
                return mid;
            }
            if (count > mid) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;

    }
    int find(int[] nums , int mid) {
        int count = 0;
        for(int element:nums) {
            if (element>=mid) {
                count++;
            }
        }
        return count; 
    }
}
