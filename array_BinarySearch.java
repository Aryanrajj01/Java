
public class binarysearch {
    public static void main(String[] args) {
        int[] arr = {2,4,3,5,6,8,7,9,11,14,17,21,32,55,56};
        
        int l = 0;
        int n = 56;
        int h = arr.length-1;
        int m = (l+h)/2;
        while(l<=h){
            if(arr[m] == n){
                System.out.println(m);
                break;
            }
            else if(arr[m] < n){
                l = m+1;
            }
            else{
                h = m-1;
            }
            m = (l+h)/2;
        }
        if(l>h){
            System.out.println("Not Found");
        }
    }
}
