import java.util.InputMismatchException;
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
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the value in the array");
        try{
            for(int i=0;i<size;i++){
                arr[i]=sc.nextInt();
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        catch(InputMismatchException s){
            s.printStackTrace();
        }
    }
}
