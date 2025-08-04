import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {32, 332, 324, 23, 67, 786 - 3, 54, -45};
        System.out.print("Please enter target: ");
        int target = in.nextInt();
        int ans = linearSearch(arr, target);
        System.out.println(ans);

    }

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        // run a for loop
//        for (int index = 0; index < arr.length; index++) {
//            if (arr[index] == target) {
//                return index;
//            }
//        }

        for( int element: arr){
            if(element == target){
                return target;
            }
        }

        // this line will execute if none of the return statements above have executed
        // hence target not found
        return -1;
    }
}
