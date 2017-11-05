class Outer {
    int outer_x = 100;

    void test() {
        for(int i=0; i<10; i++) {
            // inner class can be used only inside
            // of the Outer class
            class Inner {
                void display()  {
                    System.out.println("outer_x = " + outer_x);
                }
            }
            Inner inner = new Inner();
            inner.display();
        }
    }
}

class InnerClassDemo {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test();
    }
}
