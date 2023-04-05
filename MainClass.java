public class MainClass {
    public static void main(String... args) {
        System.out.println("Starting point::");
        int a = 5;
        int b = 6;

        System.out.println("Summation of two number::" + add(a, b));
    }

    private static int add(int a, int b) {
        return a+b;
    }
}
