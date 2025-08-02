import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int ans = 0;

        while(true){
            // take the operator as input
            System.out.print("Enbter the operator: ");
            char op = in.next().trim().charAt(0);
            if(op == '+' || op == '*' || op == '-' || op == '/' || op == '%'){
                // input two numbers
                System.out.print("Enbter two numbers: ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();
                System.out.println();

                if(op == '+'){
                    ans = num1 + num2;
                }
                if(op == '-'){
                    ans = num1 - num2;
                }
                if(op == '*'){
                    ans = num1 * num2;
                }
                if(op == '/'){
                    ans = num1 / num2;
                }
                if(op == '%'){
                    ans = num1 % num2;
                }
            } else if (op == 'x' || op == 'X'){
                break;
            }else {
                System.out.println("Invalid Operation!!");
            }
            System.out.println(ans);
        }

    }
}
