/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mooshahe
 */
public class Rectangle extends Shape implements Comparable<Shape>{
    private double width;
    private double height;
    
    public Rectangle() {
        super();
        this.height = 0;
        this.width = 0;
    }
    
    public Rectangle(double x, double y, double width, double height) {
        super(x,y);
        this.width = width;
        this.height = height;
    }
    
    public double getWidth() {
        return this.width;
    }
    
    public void setWidth(double width) {
        this.width = width;
    }
    
    public double getHeight() {
        return this.height;
    }
    
    public void setHeight(double height) {
        this.height = height;
    }
    
    public boolean contains(double x, double y) {
        if (x < this.getWidth() && y < this.getHeight()) {
            return true;
        } else {
            return false;
        }
    }
    
    public double getArea() {
        return this.height*this.width;
    }
    
    public double getPerimeter() {
        return 2*(this.height+this.width);
    }
    
    public boolean contains(Rectangle r) {
        boolean insideAnotherRectangle = false;
        
        if (r.getX() < (this.getWidth()/2 + this.getX()) && r.getX() > this.getX() - (this.getWidth()/2)) {
            if (r.getY() < (this.getY() + this.getHeight()/2) && r.getY() > this.getY()-(this.getHeight()/2)) {
                if (r.getWidth() <= this.getWidth() && r.getHeight() <= this.getHeight()) {
                    insideAnotherRectangle = true;
                }
            }
        }
        return insideAnotherRectangle;
    }
    
    public boolean overlaps(Rectangle r) {
        return this.getX() < r.getX() + r.getWidth() && this.getX() + this.getWidth() > r.getX() && this.getY() < r.getY() + r.getHeight() && this.getY() + this.getHeight() > r.getY();
    }

    @Override
    public int compareTo(Shape arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String toString() {
        return String.format("Rectangle" + "\n" +
                "Center coordinates are: (%s, %s)",super.getX(),super.getY());
                
    }
    
}
