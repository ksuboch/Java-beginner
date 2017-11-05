class OverloadDemo2 {
    void test() {
        System.out.println("No params");
    }

    void test(double d) {
        System.out.println("Double parameter");
        System.out.println("d  = " + d);
    }

    void test(float f) {
        System.out.println("Float parameter");
        System.out.println("f = " + f);
    }

    void test(int i) {
        System.out.println("Integer parameter");
        System.out.println("i = " + i);
    }
}

class Overload {
    public static void main(String[] args) {
        OverloadDemo2 od = new OverloadDemo2();

        od.test();
        od.test(10);
        od.test(123.2);
    }
}
