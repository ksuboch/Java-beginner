class VarArgs {
    static void vaTest(int ...v) {
        System.out.println("Count of args = " + v.length);
        for(int x : v) {
            System.out.println(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest();
        vaTest(10);
        vaTest(1, 2, 3);
    }
}
