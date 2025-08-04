public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-17, -4, 5, 0, 12, 14, 67 ,89};
        int target = 14;
        int ans = binarySearch(arr, target);
        System.out.println(ans);

    }

    // return the index
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

        while(start <= end){
            // find the middle element
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end = mid - 1;
            } else if(target > arr[mid]){
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }

        return -1;
    }
}
