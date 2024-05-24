import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculator On");
        int ans = 0;
        while (true) {
            System.out.print("Enter the operator: ");
            char op = sc.next().trim().charAt(0);
            if ((op == '+') || (op == '-') || (op == '*') || (op == '/') || (op == '%')) {
                System.out.print("Enter 1st number: ");
                int num1 = sc.nextInt();
                System.out.print("Enter 2nd number: ");
                int num2 = sc.nextInt();
                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                }
                if (op == '%') {
                    if (num2 != 0) {
                        ans = num1 % num2;
                    }
                }
            }else if ((op=='x') || (op=='X')) {
                System.out.println("Calculator off");
                break;
            }else {
                System.out.println("Invalid operation");
            }
            System.out.println("The answer is: "+ans);
        }
    }
}