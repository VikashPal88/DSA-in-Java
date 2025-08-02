import java.util.Scanner;

public class CountOccurrences {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int number = 23482542;
        int count = 0;

        while(number > 0){
            int rem = number % 10;
            if(rem == n){
                count++;
            }
            number /= 10;
        }

        System.out.println(count);
    }
}
