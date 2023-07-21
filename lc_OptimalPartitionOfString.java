class Solution{
  public static void main(String[] args){
int count = 1;
    Set<Character> set = new HashSet<>();
    for(int i = 0;i<set.length;i++){
if(!set.contains(s.charAt(i))){
set.add(s.charAt(i));
}
      else{
        count++;
        set.clear();
        set.add(s.charAt(i));
      }
    }
    return count;
  }
}
