class Solution {
    public int longestPalindrome(String s) {
        Map<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray())
        {
            // if(map.containsKey(c))
            map.put(c,map.getOrDefault(c,0)+1);
        } 
        int res=0;int f=0;
        for(int c:map.values())
        {
            if(c%2==0)
            res+=c;
            else {res+=c-1;f=1;}
        }
        if(f==1) res++;
        return res;
    }
}
