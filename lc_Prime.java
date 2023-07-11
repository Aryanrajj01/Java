public class prime{
  public static void main(String[] args){
    int n = 10;
    int p = 20;
    for(int i = n;i<p;i++){
      for(int j = 2;j<=i;j++){
        if(i%j==0)
          break;
      }
    }
    if(i==0)
      System.out.println(x);
  }
}
