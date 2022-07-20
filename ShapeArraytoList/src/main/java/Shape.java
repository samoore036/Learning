/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mooshahe
 */
public abstract class Shape {
    private double x;
    private double y;
    
    public Shape() {
        this.x = 0.0;
        this.y = 0.0;
    }
    
    public Shape(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public void setX(double x) {
        this.x = x;
    }
    
    public double getX() {
        return this.x;
    }
    
    public void setY(double y) {
        this.y = y;
    }
    
    public double getY() {
        return this.y;
    }
    
    
}
