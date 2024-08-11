package mainpolymorphism;

import polymorphism.Drawing;

public class Main {
    public static void main(String[] args) {
        Drawing drawing = new Drawing();
        drawing.draw();
        drawing.draw(1);
        drawing.draw(1,1,1);
        drawing.draw(1,1,1,1);
        drawing.draw(1,1);

        int res1 = drawing.sum(1,2);
        System.out.println("drawing.sum(1,2) : "+res1);
        int res2 = drawing.sum(1,2,3);
        System.out.println("drawing.sum(1,2,3) : "+res2);
        double res3 = drawing.sum(2.89,6.88);
        System.out.println("drawing.sum(2.89,6.88) : "+res3);
    }
}
