public class MaxWealth {
    public static void main(String[] args) {
//        int[][] accounts = {
//                [1,2,3],
//                [3,2,1]
//        };
    }

    static int maximumWealth(int[][] accounts){
        int max = Integer.MIN_VALUE;
        for(int[] ints: accounts){
            int sum = 0;
           for(int anInts : ints){
                sum += anInts;
            }
            if(sum > max){
                max= sum;
            }
        }

        return max;
    }
}
