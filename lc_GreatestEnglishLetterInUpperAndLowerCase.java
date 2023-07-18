class Solution{
public static void main(String s){
    Set<Character> se = new HashSet<>();
  for(int i = 0;i<s.length;i++){
    se.add(s.charAt(i));
  }
  String ans = "";
  for(char ch='Z';ch>='A';ch--){
    if(se.contains(ch) && se.contains((char)(char+32))){
return ans+ch;
    }
  }
return ans;
}
}
