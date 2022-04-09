package Array;
import java.util.Scanner;

public class MaxMin {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            ArrayClass arr = new ArrayClass(s);
            arr.initializeArray(s);
            System.out.println(arr);
            System.out.println(arr.arrayMin());
            System.out.println(arr.arrayMax());
        }
    }
