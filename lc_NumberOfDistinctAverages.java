class Solution {
    public int distinctAverages(int[] nums) {
        //Arrays.sort(nums);
        /*int a = 0;
        int b = nums.length-1;
        double[] ans = new double[nums.length];
        while(a<=b){
            for(int i = 0;i<=nums.length-1;i++){
                ans[i] = nums[i];
            
            ans[i] = ((double)(nums[a]+nums[b])/2);
            a++;
            b--;
        }
        }
    }
}
*/
Arrays.sort(nums);
int a = 0;
int b = nums.length-1;
HashSet<Double> s = new HashSet<>();
while(a<b){
    s.add((double)(nums[a++]+nums[b--])/2.0);
    
}
return s.size();
   }
}




