import java.util.InputMismatchException;
import java.util.Scanner;

class subarray {
    public boolean FindSum(int arr[], int size, int target) {
        boolean res = false;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("arr[" + i + "] + arr[" + j + "] = " + target);
                    res = true;
                }
            }

        }
        if (res == true) {
            return res = true;
        } else {
            return res = false;
        }

    }
}

public class SubArray {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        subarray ob = new subarray();
        System.out.println("Enter the size of the Array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the value in the array");
        while (true) {
            try {
                for (int i = 0; i < size; i++) {
                    arr[i] = sc.nextInt();
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                e.printStackTrace();
            // continue;

            } catch (InputMismatchException s) {
                s.printStackTrace();
            continue;

            }
            break;
        }

        System.out.println("Enter the Target Value");
        int target = sc.nextInt();
        boolean result = ob.FindSum(arr, size, target);
        System.out.println(result);
    }
}
