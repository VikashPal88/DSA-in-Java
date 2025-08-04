import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30},
                {18, 74, 67, 2},
                {23,34, 6, 2, 23 ,24},
                {21, 33, 4}
        };

        int target = 24;
        int[] ans = search(arr, target); // formate of return value {row, col}
        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
    }

    static int[] search(int[][] arr, int target){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] == target){
                    return new int[]{i, j};
                }
            }
        }

        return new  int[]{-1, -1};
    }

    static int max(int[][] arr){
        int ans = arr[0][0];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] > ans){
                    ans = arr[i][j];
                }
            }
        }
        return ans;
    }
}
