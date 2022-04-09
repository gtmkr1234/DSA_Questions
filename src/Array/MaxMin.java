package Array;

import java.util.Scanner;

public class MaxMin {
    class Array{
        int n;
        int [] arr;
        public Array(Scanner s){
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
        public int arrayMax(){
            int max= arr[0];
            for(int i:arr){

            }
        }
    }
}
