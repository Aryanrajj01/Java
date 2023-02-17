class Solution {
    public int[] intersection(int[] num1, int[] num2) {
      ArrayList<Integer> a = new ArrayList<>();
        for(int i = 0;i<num1.length;i++){
            for(int j = 0;j<num2.length;j++){
                if(num1[i] == num2[j] && !a.contains(num1[i])){
                    a.add(num1[i]);
                }
            }
        }
        int[] ar = new int[a.size()];
        int i = 0;
        for(int n : a){
            ar[i++] = n;
        }
        return ar;
    }
}
