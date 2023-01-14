public class Reversed{
  public static void main(String[] args) {
    String s = "HEllo";
    String a = "";
    for(int i = 0;i<s.length();i++){
      a = s.charAt(i) + a;
    }
    System.out.println(a);
  }
}
