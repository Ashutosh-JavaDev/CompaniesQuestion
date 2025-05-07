import java.util.Scanner;
class subarray{
    public static boolean FindSum(int arr[],int size,int target){
        boolean res=false;
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println("value found at index: "+i);
                    return true;
                }
            }
            break;
        }
        return false;

    }
}
public class SubArray {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
