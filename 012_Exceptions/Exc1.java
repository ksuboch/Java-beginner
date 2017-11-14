class Exc1 {
    public static void main(String[] args) {
        int d, a;
        try {
            d = 0;
            a = 42 / d;
            System.out.println("Test string");
        } catch (ArithmeticException e) {
            System.out.println("Division by 0");
        }
        System.out.println("After catch operator");
    }
}