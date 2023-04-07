class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] p = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            int m =1;
            for(int j = 0;j<nums.length;j++){
                if(i==j){
                    continue;
                }
                m = m*nums[j];
            }
            p[i] = m;
            }
        return p;
            }
        }
        /*
        int[] p =new int[nums.length];
          int m =1;
    for(int i = 0;i<nums.length;i++){
      
        nums[++i] = 1;
        m = m*nums[i];
    }
    for(int j = 0;j<nums.length;j++){
        p[j] = m;
    }
    return p;
    */
    
