package pack;

/**
 * Created by Ostin on 22.05.2015.
 */
class Window{
    Window(int marker){
        System.out.println("Window(" + marker + ")");
    }
}

public class House {
    Window w1 = new Window(1);
    House(){
        System.out.println("House");
        w3 = new Window(33);
    }
    Window w2 = new Window(2);
    void f() {
        System.out.println("f()");
    }
    Window w3 = new Window(3);
}
