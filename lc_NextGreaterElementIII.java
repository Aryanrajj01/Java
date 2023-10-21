class Solution {
    public int nextGreaterElement(int n) {
        int[]nums=new int[counted(n)];
        for(int i=nums.length-1;i>=0;i--){
            nums[i]=n%10;
            n=n/10;
        }
        int p=0;
	for (int i =nums.length-2;i>=0; i--) {
		if(nums[i]<nums[i+1]) {
			p=i;
			break;
		}
	}
	int q=0;
	for (int i = nums.length-1; i >p; i--) {
		if(nums[i]>nums[p]) {
		q=i;
		break;
		}
	}
	if(p==0&&q==0) {
		reverse(nums,0,nums.length-1);
		return -1;
	}
	//swapping
	int temp=nums[p];
	nums[p]=nums[q];
	nums[q]=temp;
	reverse(nums,p+1,nums.length-1);
    long ans=0;
    for(int i=0;i<nums.length;i++){
        ans=ans*10+nums[i];
    }
    if(ans>Integer.MAX_VALUE){
        return -1;
    }else{
        return (int)ans;
    }
	
    }
    public static void reverse(int []nums,int i,int j){
    
    while(i<j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        i++;
        j--;
    }
}
public static int counted(int n){
    int count=0;
    while(n!=0){
        int rem=n%10;
        count++;
        n=n/10;
    }
    return count;
}
}
