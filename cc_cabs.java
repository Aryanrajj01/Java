
import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		for(int i=1;i<=n;i++){
		    if(a<b){
		        System.out.println("FIRST");
		    }
		    if(a==b){
		        System.out.println("ANY");
		    }
		    if(a>b){
		        System.out.println("SECOND");
		    }
		}
	}
}
