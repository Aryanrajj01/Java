import java.util.*;
public class arrayLargest{
    public static int Largest(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
            
        }
        return max;
    }
    public static int[] take(){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i= 0;i<size;i++){
            arr[i] = sc.nextInt();

        }
        return arr;
    }
    public static void display(int arr[]){
        int size = arr.length;
        for(int i = 0;i<size;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = take();
        int l = Largest(arr);
        System.out.println(l);
        
    }

}
