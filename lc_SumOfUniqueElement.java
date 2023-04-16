class Solution {
    public int sumOfUnique(int[] nums) {
        /*Arrays.sort(nums);
        int a = 0;
        for(int i = 0;i<nums.length;++i){
            if(nums[i] != i){
                a += i;
            }
        }
        return a;
    }
}
*/
    int arr[]=new int[101];
    int n = nums.length;
    for(int i=0;i<n;i++){
        arr[nums[i]]++;
    }
    int s=0;
    for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                s=s+i;
            }
        }
    return s;
    }
}
