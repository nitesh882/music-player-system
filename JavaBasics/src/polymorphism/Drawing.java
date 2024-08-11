package polymorphism;

public class Drawing {

    public void draw(){
        System.out.println("No inputs it's a circle");
    }

    public void draw(int point1){
        System.out.println("It prints point");
    }

    public void draw(int point1, int point2){
        System.out.println("It prints a line");
    }

    public void draw(int point1, int point2, int pint3){
        System.out.println("It prints a triangle");
    }

    public void draw(int point1, int point2, int pint3, int point4){
        System.out.println("It prints a square/rectangle");
    }

    public int sum(int x, int y){
        return x+y;
    }

    public int sum(int x, int y, int z){
        return x+y+z;
    }

    public double sum(double x, double y){
        return x+y;
    }
}
