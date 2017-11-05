class Test {
    int a, b;

    void test(int a, int b) {
        a *= 2;
        b /= 2;
    }

    void test(Test t) {
        t.a *= 2;
        t.b /= 2;
    }
}

class PassArgs {
    public static void main(String[] args) {
        Test ob = new Test();
        int a = 15, b = 20;

        System.out.println("a and b before test " + a + ", " + b);

        ob.test(a, b);
        System.out.println("a and b after test " + a + ", " + b);

        ob.a = ob.b = 10;
        System.out.println("ob.a and ob.b before test " + ob.a + ", " + ob.b);

        ob.test(ob);
        System.out.println("ob.a and ob.b after test " + ob.a + ", " + ob.b);
    }
}
