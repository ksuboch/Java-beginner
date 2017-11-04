class Ternary {
    public static void main(String[] args) {
        int i, k;

        i = 10;
        k = i < 0 ? -i : i; // abs(i)
        System.out.println("abs(" + i + ") = " + k);

        i = -10;
        k = i < 0 ? -i : i;
        System.out.println("abs(" + i + ") = " + k);
    }
}
