package cylinder_19;

//        19. Cylinder
public class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
     if (radius<0){ this.radius=0;}
         else this.radius=radius;
    }
    public double getRadius(){
        return radius;
    }
    public double getArea (){
        return(radius*radius*Math.PI);
    }
}
