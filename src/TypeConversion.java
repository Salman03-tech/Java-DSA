public class TypeConversion {
    public static void main(String[] args) {
        // First Scenario
        int a = 4;
        long b = a;
        System.out.println(a);

//        // Second Scenario
//        long c = 5;
//        int d = c; // java: incompatible types: possible lossy conversion from long to int
//        System.out.println(d);

        // Type Casting
        long e = 5;
        int f = (int)e;
        System.out.println(f);
    }
}
