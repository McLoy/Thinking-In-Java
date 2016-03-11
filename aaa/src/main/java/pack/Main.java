package polymorphism.music.

import polymorphism.music.Note;

*;

import org.springframework.util.Assert;
import polymorphism.music.Wind;

/**
 * Created by Ostin on 16.05.2015.
 */

public class Main{
    public static void tune(Instrument i) {
        i.play(Note.MIDDLE_C)

    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        tune(flute);
    }
}

//import net.mindview.util.*;
//class Insect{
//    private int i = 9;
//    protected int j;
//    Insect(){
//        System.out.println("i=" + i + ", j=" + j);
//    }
//    private static int x1 = printInit("Поле static Insect x1 инициализировано");
//    static  int printInit(String s){
//        System.out.println(s);
//        return 47;
//
//    }
//}
//
//public class Main extends Insect{
//    private int k = printInit("Поле Main k инициализировано");
//    public Main(){
//        System.out.println("k=" + k);
//                System.out.println("j=" + j);
//    }
//    private static int x2 = printInit("Поле static Main x2 инициализировано");
//
//    public static void main(String[] args) {
//        System.out.println("Конструктор Main");
//        Main b = new Main();
//    }
//}


//class SmallBrain{}
//
//final class Dinosaur{
//    int i = 7;
//    int j = 1;
//    SmallBrain x = new SmallBrain();
//    void f(){}
//}
//
//public class Main{
//    public static void main(String[] args) {
//        Dinosaur n = new Dinosaur();
//        n.f();
//        n.i = 40;
//        n.j++;
//    }
//}


//class WithFinals{
//    private final void f(){System.out.print("WithFinals f()");}
//        private void g(){System.out.print("WithFinals g()");}
//}
//
//class OverridingPrivate extends WithFinals{
//    private final void f(){System.out.print("OverridingPrivate f()");}
//    private void g(){System.out.print("OverridingPrivate g()");}
//}
//
//class OverridingPrivate2 extends OverridingPrivate{
//    public final void f(){
//        System.out.print("OverridingPrivate2 f()");
//    }
//    public void g(){
//        System.out.print("OverridingPrivate2 g()");
//    }
//}
//
//public class Main{
//    public static void main(String[] args) {
//        OverridingPrivate2 op2 = new OverridingPrivate2();
//        op2.f();
//        op2.g();
//        OverridingPrivate op = op2;
//        WithFinals wf = op2;
//
//    }
//}




//class Gizmo{
//    public void spin(){}
//}
//
//public class Main{
//    void with(final Gizmo g){
//        //g = new Gizmo(); //Запрещено - g объявлено final
//    }
//    void without(Gizmo g){
//        g = new Gizmo(); //Разрешено - g не является final
//        g.spin();
//    }
//    int g(final int i){return i + 1;}
//
//    public static void main(String[] args) {
//        Main bf= new Main();
//        bf.without(null);
//        bf.with(null);
//    }
//}

//class Poppet{
//    private int i;
//    Poppet(int ii){i=ii;}
//}
//public class Main{
//    private final int i=0; //Инициализированная константа
//    private final int j; //Пустая константа
//    private final Poppet p; //Пустая константа-ссылка
//    //Пустые константы необъодимо инициализировать в конструктторе
//    public Main(){
//        j = 1;
//        p = new Poppet(1);
//    }
//    public Main(int x){
//        j = x;
//        p = new Poppet(x);
//    }
//
//    public static void main(String[] args) {
//        new Main();
//        new Main(47);
//    }
//}


//import java.util.*;
//
//class Value{
//    int i;
//    public Value(int i){this.i = i;}
//}
//
//public class Main{
//    private static Random rand = new Random(47);
//    private String id;
//    public Main(String id) {this.id = id;}
//    private final int valueOne = 9;
//    private static final int VALUE_TWO = 99;
//    public static final int VALUE_THREE = 39;
//    private final int i4 = rand.nextInt(20);
//    static final int INT_5 = rand.nextInt(20);
//    private Value v1 = new Value(11);
//    private final Value v2 = new Value(22);
//    private static final Value VAL_3 = new Value(33);
//    private final int[] a = {1,2,3,4,5,6};
//    public String toString(){
//        return id+":"+"i4="+i4+", INT_5 = "  + INT_5;
//    }
//
//    public static void main(String[] args) {
//        Main fd1 = new Main("fd1");
//        fd1.v2.i++;
//        fd1.v1 = new Value(9);
//        for (int i=0; i < fd1.a.length;i++)
//        fd1.a[i]++;System.out.println(fd1);
//        System.out.println("Создаем Main");
//        Main fd2 = new Main("fd2");
//        System.out.println(fd1);
//        System.out.println(fd2);
//    }
//}

//class Instrument{
//    public void play(){
//        static void tune(Instrument i){
//            i.play();
//        }
//    }
//}
//
//public class Main extends Instrument{
//    public static void main(String[] args) {
//        Main flute = new Main();
//        Instrument.tune(flute);
//    }
//}
//
//import java.nio.file.DirectoryStream;
//import java.nio.file.Files;
//import java.util.*;
//import java.io.*;
//import java.nio.*;
//import java.lang.*;
//
//class Bowl{
//    Bowl(int marker){
//        System.out.println("Bowl(" + marker + ")");
//    }
//    void f1(int marker){
//        System.out.println("f1(" + marker + ")");
//
//    }
//}
//
//class Table{
//    static Bowl bowl1 = new Bowl(1);
//    Table(){
//        System.out.println("Table()");
//        bowl2.f1(1);
//    }
//    void f2(int marker){
//        System.out.println("f2("+marker+")");
//    }
//    static Bowl bowl2 = new Bowl(2);
//}
//
//class Cupboard{
//    Bowl bowl3 = new Bowl(3);
//    static Bowl bowl4 = new Bowl(4);
//    Cupboard(){
//        System.out.println("Copboard()");
//        bowl4.f1(2);
//    }
//    void f3(int marker){
//        System.out.println("f3(" + marker + ")");
//    }
//    static Bowl bowl5 = new Bowl(5);
//}
//
//public class Main{
//        public static void main(String[] args) {
//            System.out.println("Создание нового объекта Cupboard в main()");
//            new Cupboard();
//            System.out.println("Создание нового объекта Cupboard в main()");
//            new Cupboard();
//            table.f2(1);
//            cupboard.f3(1);
//
//        }
//        static Table table = new Table();
//        static Cupboard cupboard = new Cupboard();
//}

//public class Main{
//     public static void main(String[] args) {
//         House h = new House();
//         h.f();
//
//    }
//}


//public class Main{
//     public static void main(String[] args) {
//        MethodInit m = new MethodInit();
//        System.out.println(m.i);
//
//    }
//}


//public class Main {
//    boolean t;
//    char c;
//    byte b;
//    short s;
//    int i;
//    long l;
//    float f;
//    double d;
//
//    Main reference;
//
//    void printInitialValues() {
//        System.out.println("Тип данных   Начальное значение");
//        System.out.println("boolean      " + t);
//        System.out.println("char         [" + c + "]");
//        System.out.println("byte         " + b);
//        System.out.println("short        " + s);
//        System.out.println("int          " + i);
//        System.out.println("float        " + f);
//        System.out.println("double       " + d);
//        System.out.println("reference    " + reference);
//    }
//
//
//    public static void main(String[] args) {
//        Main iv = new Main();
//        iv.printInitialValues();
//        new Main().printInitialValues();
//    }
//}

//class Book{
//    boolean checkedOut = false;
//    Book(boolean checkOut){
//        checkedOut = checkOut;
//    }
//    void checkIn(){
//        checkedOut = false;
//    }
//    public void finalize(){
//        if(checkedOut)
//            System.out.println("Ошибка chekedOut");
//    }
//}
//
//public class Main{
//    public static void main(String[] args) {
//        Book novel = new Book(true);
//        novel.checkIn();
//        new Book(true);
//        System.gc();
//    }
//}


//public class Main{
//    int petalCount = 0;
//    String s = "initial value";
//    Main(int petals){
//        petalCount = petals;
//        System.out.println("Конструктор с параметром int.petalCount = " + petalCount);
//    }
//    Main(String ss){
//        System.out.println("Конструктор с параметром String.s = " + ss);
//        s=ss;
//    }
//    Main(String s, int petals){
//        this(petals);
////        this(s);
//        this.s = s;
//        System.out.println("Аргументы String и int");
//    }
//    Main(){
//        this("hi", 47);
//        System.out.println("Констуктор по умолчанию (без аргументов)");
//    }
//    void printPetalCount(){
////        this(11);
//        System.out.println("petalCount = " + petalCount + " s = " + s);
//    }
//
//    public static void main(String[] args) {
//        Main x = new Main();
//        x.printPetalCount();
//    }
//}



//class Person{
//    public void eat(Apple apple){
//        Apple peeled = apple.getPeeled();
//        System.out.println("Yummy");
//    }
//}
//
//class Peeler{
//    static Apple peel(Apple apple){
//        return apple;
//    }
//}
//
//class Apple {
//    Apple getPeeled(){return Peeler.peel(this);}
//}
//
//public class Main{
//    public static void main(String[] args) {
//        new Person().eat(new Apple());
//    }
//}

//public class Main{
//    int i = 0;
//    Main increment(){
//        i++;
//        return this;
//    }
//    void print(){
//        System.out.println("i=" + i);
//    }
//
//    public static void main(String[] args) {
//        Main x = new Main();
//        x.increment().increment().increment().print();
//    }
//}

//public class Main{
//    //static Test monitor = new Test();
//
//    void f1(char x){ System.out.print("f1(char)"); }
//    void f1(byte x){ System.out.print("f1(byte)"); }
//    void f1(short x){ System.out.print("f1(short)"); }
//    void f1(int x){ System.out.print("f1(int)"); }
//    void f1(long x){ System.out.print("f1(long)"); }
//    void f1(float x){ System.out.print("f1(float)"); }
//    void f1(double x){ System.out.print("f1(double)"); }
//
//    void f2(char x){ System.out.print("f2(char)"); }
//    void f2(byte x){ System.out.print("f2(byte)"); }
//    void f2(short x){ System.out.print("f2(short)"); }
//    void f2(int x){ System.out.print("f2(int)"); }
//    void f2(long x){ System.out.print("f2(long)"); }
//    void f2(float x){ System.out.print("f2(float)"); }
//
//
//    void f3(char x){ System.out.print("f3(char)"); }
//    void f3(byte x){ System.out.print("f3(byte)"); }
//    void f3(short x){ System.out.print("f3(short)"); }
//    void f3(int x){ System.out.print("f3(int)"); }
//    void f3(long x){ System.out.print("f3(long)"); }
//
//    void f4(char x){ System.out.print("f4(char)"); }
//    void f4(byte x){ System.out.print("f4(byte)"); }
//    void f4(short x){ System.out.print("f4(short)"); }
//    void f4(int x){ System.out.print("f4(int)"); }
//
//    void f5(char x){ System.out.print("f5(char)"); }
//    void f5(byte x){ System.out.print("f5(byte)"); }
//    void f5(short x){ System.out.print("f5(short)"); }
//
//    void f6(char x){ System.out.print("f6(char)"); }
//    void f6(byte x){ System.out.print("f6(byte)"); }
//
//    void f7(char x){ System.out.print("f7(char)"); }
//
//    void testDouble(){
//        double x = 0;
//        System.out.println("Параметр типа double");
//        f1(x);
//        f2((float)x);
//        f3((long)x);
//        f4((int)x);
//        f5((short)x);
//        f6((byte)x);
//        f7((char)x);
//
//    }
//
//
//    public static void main(String[] args) {
//        Main p = new Main();
//        p.testDouble();
//
//    }
//}

//public class Main{ //работа с файлами перебор
//    public static void main(String[] args) {
//        try(DirectoryStream<Path> dirStream  = Files.newDirectoryStream(usrbin)){
//            for( Path child: dirStream){
//                System.out.println(child);
//            }
//        }
//    }
//}

//public class Main{
//    public static void main(String[] args) {
//        System.out.println("Please enter number: ");
//        int n = 0;
//        while(true){
//            String s = "7";
//            try{
//                n = Integer.parseInt(s);
//                break;
//            } catch (NumberFormatException e){
//                System.out.println("Bad number, try again: ");
//            }
//        }
//    }
//}


//public class Main{
//    void f1(char x){ System.out.print("f1(char)"); }
//    void f1(byte x){ System.out.print("f1(byte)"); }
//    void f1(short x){ System.out.print("f1(short)"); }
//    void f1(int x){ System.out.print("f1(int)"); }
//    void f1(long x){ System.out.print("f1(long)"); }
//    void f1(float x){ System.out.print("f1(float)"); }
//    void f1(double x){ System.out.print("f1(double)"); }
//
//    void f2(byte x){ System.out.print("f2(byte)"); }
//    void f2(short x){ System.out.print("f2(short)"); }
//    void f2(int x){ System.out.print("f2(int)"); }
//    void f2(long x){ System.out.print("f2(long)"); }
//    void f2(float x){ System.out.print("f2(float)"); }
//    void f2(double x){ System.out.print("f2(double)"); }
//
//    void f3(short x){ System.out.print("f3(short)"); }
//    void f3(int x){ System.out.print("f3(int)"); }
//    void f3(long x){ System.out.print("f3(long)"); }
//    void f3(float x){ System.out.print("f3(float)"); }
//    void f3(double x){ System.out.print("f3(double)"); }
//
//    void f4(int x){ System.out.print("f4(int)"); }
//    void f4(long x){ System.out.print("f4(long)"); }
//    void f4(float x){ System.out.print("f4(float)"); }
//    void f4(double x){ System.out.print("f4(double)"); }
//
//    void f5(long x){ System.out.print("f5(long)"); }
//    void f5(float x){ System.out.print("f5(float)"); }
//    void f5(double x){ System.out.print("f5(double)"); }
//
//    void f6(float x){ System.out.print("f6(float)"); }
//    void f6(double x){ System.out.print("f6(double)"); }
//
//    void f7(double x){ System.out.print("f7(double)"); }
//
//    void testCostVal(){
//        System.out.print("5: ");
//        f1(5);f2(5);f3(5);f4(5);f5(5);f6(5);f7(5); System.out.println();
//    }
//
//    void testChar(){
//        char x = 'x';
//        System.out.print("char: ");
//        f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x); System.out.println();
//    }
//
//    void testByte(){
//        byte x = 0;
//        System.out.print("параметр типа byte: ");
//        f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x); System.out.println();
//    }
//
//    void testShort(){
//        short x = 0;
//        System.out.print("short: ");
//        f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x); System.out.println();
//    }
//
//    void testInt(){
//        short x = 0;
//        System.out.print("int: ");
//        f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x); System.out.println();
//    }
//
//    void testLong(){
//        long x = 0;
//        System.out.print("long: ");
//        f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x); System.out.println();
//    }
//
//    void testFloat(){
//        float x = 0;
//        System.out.print("float: ");
//        f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x); System.out.println();
//    }
//
//    void testDouble(){
//        double x = 0;
//        System.out.print("double: ");
//        f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x); System.out.println();
//    }
//
//    public static void main(String[] args) {
//        Main p = new Main();
//        p.testCostVal();
//        p.testChar();
//        p.testByte();
//        p.testShort();
//        p.testInt();
//        p.testLong();
//        p.testFloat();
//        p.testDouble();
//    }
//}

//public class Main{
//
//    static void f(String s, int i){
//        System.out.println("String: " + s + ", int:" + i);
//    }
//
//    static void f(int i, String s){
//        System.out.println(", int:" + i + ", String: " + s);
//    }
//
//    public static void main(String[] args) {
//        f("Сначала строка", 11);
//        f(99, "Сначала число");
//
//    }
//
//        }

//class Tree{
//    int height;
//    Tree(){
//        System.out.println("Сажаем росток");
//        height = 0;
//    }
//    Tree(int initialHeight){
//        height = initialHeight;
//        System.out.println("Создание нового дерева высотой " + height + " м.");
//    }
//
//    void info(){
//        System.out.println("Дерево высотой "+ height + " м.");
//    }
//
//    void info(String s){
//        System.out.println(s+": Дерево высотой "+ height + " м.");
//    }
//}
//
//public class Main{
//    public static void main(String[] args) {
//        for (int i=0; i<5; i++){
//            Tree t = new Tree(i);
//            t.info();
//            t.info("Перегруженный метод");
//
//        }
//        new Tree();
//    }
//}

//public class Main {
//    public static void main(String[] args) throws Exception {
//        for(int i=0; i<8; i++){
//            new Rock2(i);
//        }
//
//    }
//
//}
//
//class Rock2{
//    Rock2(int i){
//        System.out.println("Rock" + i + " ");
//    }
//}

