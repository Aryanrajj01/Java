class Solution{
  public int bulbSwitch(int n){

int count=0;
        int t=0;
        int i=1;
        while(n>t){
            t+=2*i+1;
            count++;
            i++;
        }
        return count;
  }
}
