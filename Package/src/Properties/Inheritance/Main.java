package Properties.Inheritance;

public class Main {

    double l;
    double h;
    double w;

    Main() {
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    //cube 
    Main(double side) {
        this.w = side;
        this.l = side;
        this.h = side;
    }

    Main(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Main(Main old) {
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;


    
    
    }


    public static void main(String[] args) {
        // Main box1 = new Main(4, 5.6, 6.5);
        // Main box2 = new Main(box1);

        // System.out.println(box2.l + " " + box1.w + " " + box1.h);

        Main box3 = new Main();
        System.out.println(box3.h + " " + box3.weight);
    }
}
