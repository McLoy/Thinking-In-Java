package polymorphism.shape;

/**
 * Created by Ostin on 20.08.2015.
 */
public class Square extends Shape{
    public void draw(){
        System.out.println("Square.draw()");
    }
    public void erase(){
        System.out.println("Square.erase()");
    }
}
