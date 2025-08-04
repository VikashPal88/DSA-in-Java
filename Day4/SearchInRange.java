public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {10, 20 ,34, 46,  5, 36 ,  6};
        int target = 7;
        boolean ans = searchInRange(arr, 2, 5, target);
        System.out.println(ans);
    }

    static boolean searchInRange(int[] arr, int start, int end, int target){

        if(arr.length == 0){
            return false;
        }

        for(int i = start; i <= end; i++){
            if(arr[i] == target){
                return true;
            }
        }

        return false;
    }
}
