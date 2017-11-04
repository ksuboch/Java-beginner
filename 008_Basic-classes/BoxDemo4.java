class Box {
    double width, height, depth;


    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    double volume() {
        return width * height * depth;
    }
}

class BoxDemo4 {
    public static void main(String[] args) {
        Box mybox1 = new Box(10, 20, 30);
        Box mybox2 = new Box(3, 6, 9);

        System.out.println("Volume 1 = " + mybox1.volume());
        System.out.println("Volume 2 = " + mybox2.volume());
    }
}
