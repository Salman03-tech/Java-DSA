import java.util.Scanner;

public class SumInputUser {
    public static void main(String args[]){
        System.out.println("Welcome to addition");

        Scanner sc = new Scanner(System.in);

        System.out.println("kindly enter your first number");
        int firstNumber = sc.nextInt();

        System.out.println("Now enter your second number");
        int secondNumber = sc.nextInt();

        int sum = firstNumber+secondNumber;
        System.out.println("The total sum is: " + sum);
    }
}
