import java.util.Scanner;

public class InputMethods {

    //input methods
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

//        String singleWord = scan.next();
//        System.out.println(singleWord);


/*        scan.next() does not consume the newline character left in the input buffer.
          When you call scan.nextLine() right after it, it reads that leftover newline —
          resulting in an empty string for includesSpace.*/

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