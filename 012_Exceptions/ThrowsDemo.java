class ThrowsDemo {
    static void ThrowsOne(String arg) throws IllegalAccessException {
        System.out.println("Throws an exception");
        if(!arg.equals("hello")) {
            throw new IllegalAccessException("Demo");
        }
    }

    public static void main(String[] args) {
        System.out.println(args.length);
        try {
            ThrowsOne(args[0]);
        } catch(IllegalAccessException e) {
            System.out.println("Catches an exception " + e);
        }
    }
}