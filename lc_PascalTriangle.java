class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ll=new ArrayList<List<Integer>>();
        for(int i=0;i<n;i++){
            List<Integer> l=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==i || j==0)
                    l.add(j,1);
                else
                    l.add(ll.get(i-1).get(j)+ll.get(i-1).get(j-1));
            }
            ll.add(l);
        }
        return ll;
    }
}
