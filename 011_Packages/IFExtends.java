interface A {
    void meth1();
    void meth2();
}

interface B extends A {
    void meth3();
}

class MyClass implements B {
    @Override
    public void meth1() {
        System.out.println("Method 1");
    }

    @Override
    public void meth2() {
        System.out.println("Method 2");
    }

    @Override
    public void meth3() {
        System.out.println("Method 3");
    }
}

class IFExtends {
    public static void main(String[] args) {
        MyClass ob = new MyClass();

        ob.meth1();
        ob.meth2();
        ob.meth3();
    }
}
