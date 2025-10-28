import java.util.Scanner;

public class ProductInputUser {
    public static void main(String[] args) {
        System.out.println("Product Calculator");

        Scanner sc = new Scanner(System.in);

        System.out.println("First Number");
        int firstNumber = sc.nextInt();

        System.out.println("Second Number");
        int secondNumber = sc.nextInt();

        int product = firstNumber * secondNumber;

        System.out.println("The product of two numbers are: " + product);
    }
}
