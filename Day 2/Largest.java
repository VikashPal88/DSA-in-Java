import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

//        if(a >b && a >c ){
//            System.out.println("a is greater");
//        }else if(b > c && b > a){
//            System.out.println("b is greater");
//        }else{
//            System.out.println("c is greater");
//        }

//        int max = a;
//        if(b > max){
//            max = b;
//        }
//        if(c > max){
//            max = c;
//        }
        int max = Math.max(c, Math.max(a, b));

        System.out.println(max + " is greater");
    }
}
