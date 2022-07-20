
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mooshahe
 */
public class main {
    public static void main(String[] args) {
        Circle c = new Circle(2,3,30);
        Rectangle r = new Rectangle(6,5,200,120);
        Shape[] shapeArray = new Shape[2];
        shapeArray[0] = c;
        shapeArray[1] = r;
        
        ArrayList<Shape> shapeList = new ArrayList<>();
        for (Shape s : shapeArray) {
            shapeList.add(s);
        }
        System.out.println(shapeList);
    }
}
