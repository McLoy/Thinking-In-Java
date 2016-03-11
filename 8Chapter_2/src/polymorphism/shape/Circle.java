package polymorphism.shape;

/**
 * Created by Ostin on 20.08.2015.
 */
public class Circle extends Shape {
    public void draw(){
        System.out.println("Circle.draw()");
    }
    public void erase(){
        System.out.println("Circle.erase()");
    }
}
