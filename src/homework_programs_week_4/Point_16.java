package homework_programs_week_4;

/**
 *     16. Point
 *     You have to represent a point in 2D space. Write a class with the name Point.
 *     The class needs two
 *     fields (instance variables) with name x and y of type int.
 *     The class needs to have two constructors. The first constructor does not have any
 *     parameters (no-arg constructor).
 *     The second constructor has parameters x and y of type int and it needs to initialize the
 *     fields.
 */

// Constructors with paramaters.

public class Point_16 {
    int x;
    int y;
// Constructors with zero args
    public Point_16() {
    }

    public Point_16(int x, int y) {
        this.x = x;
        this.y = y;
    }
    //* Method named getX without any parameters, it needs to return the value of x field.
    public int getX(){
        return x;
    }
//  * Method named getY without any parameters, it needs to return the value of y field
    public int getY() {
        return y;
    }
// * Method named setX with one parameter of type int, it needs to set the value of the x field.
    public void setX(int x) {
        this.x = x;
    }
// * Method named setY with one parameter of type int, it needs to set the value of the y field.
    public void setY(int y) {
        this.y = y;
    }

    //Method to calculate the distance between this point and point 0.0

    public double distance(){
        return Math.sqrt(x * x + y * y);
    }
    public double distance(int x, int y){
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public double distance(Point_16 another) {
        int xDiff = this.x - another.getX();
        int yDiff = this.y - another.getY();
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public static void main(String[] args) {
        Point_16 first = new Point_16(6,5);
        Point_16 second  = new Point_16(3,1);
        System.out.println("distance(0,0)=" + first.distance());
        System.out.println("distance(second)=" +first.distance(second));
        System.out.println("distance(2,2)="+ first.distance(2,2));
        Point_16 point = new Point_16();
        System.out.println("distance()=" + point.distance());
    }

}
