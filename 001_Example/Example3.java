/*
    Отличия между int и double
*/
class Example3 {
    public static void main(String args[]) {
        int var;
        double x;

        var = 10;
        x = 10.0;

        System.out.println("Value of var: " + var);
        System.out.println("value of x: " + x);

        var = var / 4;
        x = x / 4;

        System.out.println("Value of var after division: " + var);
        System.out.println("value of x after division: " + x);
    }
}
