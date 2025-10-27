import java.util.Scanner;

public class InputMethods {

    //input methods
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

//        String singleWord = scan.next();
//        System.out.println(singleWord);

        String inculdesSpace = scan.nextLine();
        System.out.println(inculdesSpace);

        int number = scan.nextInt();
        System.out.println(number);

        boolean trueOrFalse = scan.nextBoolean();
        System.out.println(trueOrFalse);

        byte single = scan.nextByte();
        short s = scan.nextShort();
        double bigNumber = scan.nextDouble();
        float decimal = scan.nextFloat();
        long moreInt = scan.nextLong();
    }
}