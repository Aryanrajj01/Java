
// User input data using Function in Java!!!!!!!!

import java.util.*;
public class array1{
    public static int[] take(){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static void display(int[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]  + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = take();
        display(arr);
    }
}
