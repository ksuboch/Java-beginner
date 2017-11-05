class VarArgs2 {
    static void test(int i) {
        System.out.println("One argument");
        System.out.println("i = " + i);
    }

    static void test(int i, int...j) {
        System.out.println("Several int args");
        System.out.println("i = " + i);
        for(int x:j) {
            System.out.println("x = " + x);
        }
    }

    static void test(String msg, int...j) {
        System.out.println(msg);
        for(int x:j) {
            System.out.println("x = " + x);
        }
    }

    public static void main(String[] args) {
        test(1);
        test(1, 2);
        test(1, 2, 3);
        test("Hello", 1, 2, 3);
    }
}
