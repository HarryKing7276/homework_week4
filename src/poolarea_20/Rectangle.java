package poolarea_20;

/**
 * 20. Pool Area
 * The Swimming Company has asked you to write an application that calculates the volume of cuboid
 * shaped pools.
 *
 */

public class Rectangle {
    double width;
    double length;

    public Rectangle(double width, double length) {
       if (width<0){
           this.width = 0;
       } else
           this.width = width;
       if (length<0){
           this.length=0;
       } else
           this.length=length;
    } public double getWidth (){
        return width;
    } public double getLength(){
        return length;
    } public double getArea(){
        return width*length;
    }
}
