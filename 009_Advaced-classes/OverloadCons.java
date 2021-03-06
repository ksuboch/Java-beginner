class Box {

    double width, height, depth;

    Box() {
        width = height = depth = -1;
    }

    Box(Box b) {
        width = b.width;
        height = b.height;
        depth = b.depth;
    }

    Box(double l) {
        width = height = depth = l;
    }

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    double volume() {
        return height * width * depth;
    }
}

class OverloadCons {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box(7);
        Box mybox3 = new Box(10, 20, 15);
        Box mybox4 = new Box(mybox3);

        System.out.println("MyBox1 volume = " + mybox1.volume());
        System.out.println("MyBox2 volume = " + mybox2.volume());
        System.out.println("MyBox3 volume = " + mybox3.volume());
        System.out.println("MyBox4 volume = " + mybox4.volume());
    }
}
