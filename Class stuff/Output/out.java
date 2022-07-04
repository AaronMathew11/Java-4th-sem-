public class out {
    static void method1() {
        int d = 0;
        try {
            int a = 10 / d;
            int c[] = { 0 };
            c[40] = 50;
        } catch (ArithmeticException ae) {
            System.out.println("Divide BY 0");
        }
        System.out.println("After first try");
        try {
            method2();
        } catch (ArrayIndexOutOfBoundsException ao) {
            System.out.println("Index out of bounds");
        }
    }

    static void method2() {
        int c[] = { 0 };
        try {
            c[40] = 50;
        } catch (Exception e) {
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            out.method1();
            System.out.println("in main");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Caught in Exception");
        } finally {
            System.out.println("handled");
        }
        System.out.println("CONTINUE outside main");
    }
}
