public class FindMin {
    public static void main(String[] args) {
        int[] arr = {3,434, 2342,22, 34, 24, -1};
        System.out.println(min(arr));
    }

    static int min(int[] arr){
        if(arr.length == 0){
            return -1;
        }

        int ans = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < ans){
                ans = arr[i];
            }
        }

        return ans;
    }
}
