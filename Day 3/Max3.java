import java.util.Arrays;

public class Max3 {
    public static void main(String[] args) {
        int[] arr = {1, 3 ,23, 9, 18};

        System.out.println(max(arr));
        System.out.println(max(arr));
    }

    static void reverse(int arr[]){
        
    }


    static int maxRange(int[] arr, int start, int end){

        if(end > start){
            return -1;
        }

//        if()

        int maxVal = arr[start];
        for(int i = 1; i< arr.length; i++){
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }

        return maxVal;
    }

    static int max(int[] arr){
        int maxVal = arr[0];
        for(int i = 1; i< arr.length; i++){
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }

        return maxVal;
    }
}
