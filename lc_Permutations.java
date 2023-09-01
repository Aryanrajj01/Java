class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> list1 = new ArrayList<>();
        List<List<Integer>> list2 = new ArrayList<>();
        permutations(nums,list1,list2);
        return list2;
    }
    public static void permutations(int[] nums,List<Integer> list1,List<List<Integer>> list2){
        if(list1.size() == nums.length){
            list2.add(new ArrayList<>(list1));
…}
