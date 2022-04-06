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
    public static int[] reverse(int [] arr){
        int temp;
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }

}
class exe{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int size = s.nextInt();
        int [] arr = createArray(size);
        System.out.println("Original Array :");
        print(arr);
        reverse(arr);
        System.out.println("Reversed Array :");
        print(arr);
    }
}
