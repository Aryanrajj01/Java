class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] ans=new int[spells.length];
        Arrays.sort(potions);
        for(int i=0;i<spells.length;i++){
                int a=binary(potions,spells[i],success);
                ans[i]=potions.length-a;   
        }
        return ans;
    }
public static int binary(int[] arr, int an, long tar) {
    int low = 0;
    int high = arr.length - 1;
    while (low <= high) {
        int mid = low + (high - low) / 2;
        if ((long) arr[mid] * an < tar) {
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }
    return low;
}
}
