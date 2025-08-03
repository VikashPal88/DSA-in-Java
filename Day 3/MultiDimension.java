import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        /*
               1 2 3
               4 5 6
               7 8 9

         */

//        int[][] arr = new int[3][];
//        int[][] arr = new int[3][3];

//        int[][] arr = {
//                {1, 2, 3},  //  {1, 2, 3},
//                {4, 5, 6},  //  {4, 5, },
//                {7 ,8, 9}  //  {6, 7, ,8, 9}
//        };

        int[][] arr = new int[3][3];

        // input
        Scanner in = new Scanner(System.in);
        for(int i = 0; i< arr.length; i++){
            for(int j = 0; j< arr[i].length; j++){
                arr[i][j] = in.nextInt();
            }
        }

        //output
//        for(int i = 0; i< arr.length; i++){
//            for(int j = 0; j< arr[i].length; j++){
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }

        for(int i = 0; i< arr.length; i++){
                System.out.println(Arrays.toString(arr[i]));
        }

        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }


    }
}
