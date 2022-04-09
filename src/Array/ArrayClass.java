package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayClass {
    int n;
    int [] arr;
    public ArrayClass(Scanner s){
        System.out.println("Enter the size of the array :");
        n = s.nextInt();
        arr = new int[n];
    }
    public int[] initializeArray(Scanner s){
        System.out.println("Fill the elements of the array :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }

    @Override
    public String toString() {
        return Arrays.toString(arr) ;
    }

    public int arrayMax(){
        int max= arr[0];
        for(int i:arr){
            if (i > max){
                max = i;
            }
        }
        return max;
    }
    public int arrayMin(){
        int min= arr[0];
        for(int i:arr){
            if (i < min){
                min = i;
            }
        }
        return min;
    }

}
