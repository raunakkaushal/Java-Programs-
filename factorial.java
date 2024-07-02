import java.util.Scanner;

public class factorial {
    public static int factorial(int num) {
        int product = 1;
        for(int i = 1; i <= num; i++) {
            product *= i; // multiply i into product at every iteration of loop
        }
        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        int result = factorial(n);

        System.out.println("Factorial of " + n + " is : " + result);
    }
}
