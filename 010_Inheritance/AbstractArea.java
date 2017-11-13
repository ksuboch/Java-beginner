abstract class Figure {
    double dim1;
    double dim2;

    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    abstract double area();
}

class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }

    double area() {
        return dim1 * dim2;
    }
}

class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a, b);
    }

    double area() {
        return 0.5 * dim1 * dim2;
    }
}

class AbstractArea {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 10);
        Triangle t  = new Triangle(9, 5);
        Figure fig;

        fig = r;
        System.out.println("Rect area = " + fig.area());

        fig = t;
        System.out.println("Tri area = " + fig.area());
    }
}