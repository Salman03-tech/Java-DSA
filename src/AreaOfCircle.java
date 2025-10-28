import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        System.out.println("The formula for Area of Circle is π * rad * rad (Alt+227)");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of π");
        float pi = sc.nextFloat();

        System.out.println("Enter the value of radius");
        float radius = sc.nextFloat();

        float AreaOfCircle = pi * radius * radius;
        System.out.println(AreaOfCircle);
    }
}
