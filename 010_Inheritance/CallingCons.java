class A {
    A() {
        System.out.println("Calling A()");
    }
}

class B extends A {
    B() {
        System.out.println("Calling B()");
    }
}

class C extends B {
    C() {
        System.out.println("Calling C()");
    }
}

class CallingCons {
    public static void main(String[] args) {
        C c = new C();
    }
}