package Array;

import java.util.Scanner;
import static Array.ReverseArray.*;

public class ReverseArray {
    public static int [] createArray(int size){
        int [] arr = new int[size];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the elements of array :");
        for (int i = 0; i <size ; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }
    public static void print(int [] arr){
        for(int res : arr){
            System.out.println(res);
        }
    }

}
class exe{
    public static void main(String[] args) {
        ReverseArray o1 = new ReverseArray();
        int [] arr = createArray(4);
        print(arr);
    }
}
