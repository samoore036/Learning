/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mooshahe
 */
public class Circle extends Shape implements Comparable<Shape>{
    private double radius;
    
    public Circle(double x, double y, double radius) {
        super(x,y);
        this.radius = radius;
    }
    
    public void setCircleRadius(double radius) {
        this.radius = radius;
    }
    
    public double getRadius() {
        return this.radius;
    }
    
    public double calculateArea() {
        return Math.PI*this.radius;
    }
    
    public double calculateDiameter() {
        return 2*this.radius;
    }
    
    public double calculateCircumference() {
        return 2*Math.PI*this.radius;
    }
    
    @Override
    public int compareTo(Shape arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String toString() {
        return String.format("Circle" + "\n" +
                "Center coordinates are: (%s, %s) + " + "\n" +
                "Radius: %s" + "\n" +
                "Circumference: %s" + "\n" +
                "Area: %s" + "\n" +
                "Diameter: %s",super.getX(),super.getY(),this.getRadius(),this.calculateCircumference(),this.calculateArea(),this.calculateDiameter());
    }
    
}
