import javax.swing.text.BoxView;

class Box {
    private double width;
    private double height;
    private double depth;

    Box(Box ob) {
        width  = ob.width;
        height = ob.height;
        depth  = ob.depth;
    }

    Box(double w, double h, double d) {
        width  = w;
        height = h;
        depth  = d;
    }

    Box() {
        width  = -1;
        height = -1;
        depth  = -1;
    }

    Box(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}

class BoxWeight extends Box {
    double weight;

    BoxWeight(BoxWeight ob) {
        super(ob);
        weight = ob.weight;
    }

    BoxWeight(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }

    BoxWeight() {
        super();
        weight = -1;
    }

    BoxWeight(double len, double m) {
        super(len);
        weight = m;
    }    
}

class DemoSuper {
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
        BoxWeight mybox3 = new BoxWeight();
        BoxWeight mycube = new BoxWeight(3, 2);
        BoxWeight myclone = new BoxWeight(mybox1);
        double vol;

        vol = mybox1.volume();
        System.out.println("mybox1 volume = " + vol);
        System.out.println("mybox1 weight = " + mybox1.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println("mybox2 volume = " + vol);
        System.out.println("mybox2 weight = " + mybox2.weight);
        System.out.println();

        vol = mybox3.volume();
        System.out.println("mybox3 volume = " + vol);
        System.out.println("mybox3 weight = " + mybox3.weight);
        System.out.println();

        vol = myclone.volume();
        System.out.println("myclone volume = " + vol);
        System.out.println("myclone weight = " + myclone.weight);
        System.out.println();

        vol = mycube.volume();
        System.out.println("mycube volume = " + vol);
        System.out.println("mycube weight = " + mycube.weight);
        System.out.println();
    }
}