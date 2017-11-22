class ChainExcDemo {
    static void demoproc() {
        NullPointerException e = new NullPointerException("The top level");
        e.initCause(new ArithmeticException("The reason"));
        throw e;
    }

    public static void main(String[] args) {
        try {
            demoproc();
        } catch(NullPointerException e) {
            System.out.println("Catched exception: " + e);
            System.out.println("The reason is: " + e.getCause());
        }
    }
}
