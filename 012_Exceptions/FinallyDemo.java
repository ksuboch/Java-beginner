class FinallyDemo {
    static void procA() {
        try {
            System.out.println("In procA()");
            throw new RuntimeException("Demo exception");
        } finally {
            System.out.println("Finally in procA");
        }
    }

    static void procB() {
        try {
            System.out.println("In procB()");
            return;
        } finally {
            System.out.println("Finally in procB()");
        }
    }

    static void procC() {
        try {
            System.out.println("In procC()");
        } finally {
            System.out.println("Finally in procC()");
        }
    }

    public static void main(String[] args) {
        try {
            procA();
        } catch (Exception e) {
            System.out.println("Exception catched");
        }

        procB();
        procC();
    }
}