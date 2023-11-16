class Solution {
    public int countPrefixes(String[] words, String s) {
        int c=0;
        for(String x:words)
        {
            int n1=x.length();
            int n2=s.length();
            int i=0,j=0;int flag=1;
            while((i<n1 && j<n2) && n2>=n1)
            {
                
                if(!(x.charAt(i)==s.charAt(i)))
                flag=0;
                i++;j++;
            }
            if(flag==1 && n2>=n1) c++;
        }
        return c;
    }
}
