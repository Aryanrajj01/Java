class Solution {
    public String longestCommonPrefix(String[] nums) {
        int n=nums.length;
        if(n==0){
            return "";
        }
        Arrays.sort(nums);
        String a=nums[0];
        String b=nums[n-1];
        String ans="";
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)==b.charAt(i)){
                ans+=a.charAt(i);
            }
            else break;
        }
        return ans;
    }
}
