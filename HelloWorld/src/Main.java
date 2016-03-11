/**
 * Created by Ostin on 25.04.2015.
 */
import java.io.IOException;
import java.security.cert.Extension;
import java.util.*;
import java.util.concurrent.Callable;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("String", 12);
        map.put("String1", 14);
        map.put("String2", 15);
        if (map == null) {
            System.out.println("null");
        }
        System.out.println(map);
//        System.out.println(map);
//
//        System.out.println(map.put("Килька", 25));
//        System.out.println(map.put("Сардины", 3));
//        System.out.println(map.put("Килька", 3));
//        System.out.println(map);
//        System.out.println(map.get("Килька"));
//        System.out.println(map.get("Семга"));
//        System.out.println(map.remove("XXX"));
//        System.out.println(map);
//
//        System.out.println(map.keySet());
//        System.out.println(map.values());
//        System.out.println(map.entrySet());
//
//        Pair<String, Integer> pair = new Pair<String, Integer>("Mike",45);
//        System.out.println(pair.fst);
//        System.out.println(pair.snd);
//
//        Pair<String, Pair<String, Pair<Integer, Integer>>> guadro0;
//        Pair<String, Pair<String, Pair<String, Pair<Integer, Integer>>>> guadro1;

    }
}

//class Pair<A,B>{
//    public final A fst;
//    public final B snd;
//
//    Pair(A fst, B snd){
//        this.fst = fst;
//        this.snd = snd;
//    }
//}



//class StringWithVersion{
//    private final String str = "Mike";
//    private final int version = 1;
//
//    public String getStr() {
//        return str;
//    }
//
//    public void setStr(String str) {
//        this.str = str;
//    }
//
//    public int getVersion() {
//        return version;
//    }
//
//    public void setVersion(int version) {
//        this.version = version;
//    }
//}


//        Set<String> list = new TreeSet<String>();
//
//        System.out.println(list.add("c"));
//        System.out.println(list.add("b"));
//        System.out.println(list.add("a"));
////        System.out.println(list.add("d"));
//
//        System.out.println(list);

//        int x = 10;
//        int y = 0x10;
//        int z = 010;
//        int t = 0b10;

//        System.out.println(x);
//        System.out.println(y);
//        System.out.println(z);

//        System.out.println(t);
//        char ch0 = 55378;
//        char ch1 = 56816;
//        String str = new String(new char[]{ch0,ch1});
//        System.out.println(str);
//        System.out.println(str.codePointCount(0,2));
//        System.out.println(str.codePointAt(0));
//        System.out.println(str.charAt(0));
//        System.out.println(str.charAt(1));

//        try{
//            throw new OutOfMemoryError();
//        } catch (Error e){
//            throw new NullPointerException();
//        } catch (Exception e){
//            throw new NullPointerException();
//        } finally {
//            System.out.println(0);
//        }
//        System.out.println(0);

//        System.err.println(f());
////        fib(5);
////        System.err.println(0);
//////        boolean ex = true;
////        try{
////            System.err.println(1);
////           if (true) throw new Error();
//////            ex = false;
////        } finally{
//////            if (ex) {}
////            System.err.println(2);
////            if (true) return;
////        }
////        System.err.println(3);
//
//    }
//    public int f(){
//
//        if(Math.random() > 0.5) {
//            return 0;
//        } else {
//            throw new Error();
//        }

//        while(true);
//        try{
//            return 0;
//        } finally{
//            throw new Error();
//        }
//    }

//    public static int fib(int arg){
//        System.out.print(" "+arg);
//        return arg <2 ? 1 : fib(arg-2) + fib(arg-1);
//    }
    /*public static void f(int arg){
        if(arg<7){
            f(2*arg);
        }
        System.out.println(" "+arg);
    }*/
        /*for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print((i>j)?"+":"-");
            }
            System.out.println();

        }*/

        /*testInvert(new int[]{});
        testInvert(new int[]{0});
        testInvert(new int[]{0, 1});
        testInvert(new int[]{0, 1, 2, 3, 4});*/


   /* private static void testInvert(int[] arr) {
        System.out.print(Arrays.toString(arr)+" -> ");
        ArrayInverter.invert(arr);
        System.out.println(Arrays.toString(arr));

    }*/



    /*public static void testInvert(int[] data) {
        for(int k=0;k<data.length/2;k++){
            int tmp = data[k];
            data[data.length - 1 - k] = tmp;
        }*/
        /*Random rand=new Random(47);
        for(int i=0;i<100;i++){
            int c = rand.nextInt(26)+'a';
            System.out.print((char)c+", "+c+": ");
            switch (c){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u': System.out.println("гласная");
                    break;
                case 'y':
                case 'w': System.out.println("Условно гласная");
                    break;
                default: System.out.println("согласная");
            }
        }*/

        /*int i=0;
        outer:
        while(true){
            //inner:

            System.out.println("Внешний цикл while");

        while(true) {
            i++;
            System.out.println("i= "+i);
            if(i==1){
                System.out.println("continue");
                continue;
            }
            if(i==3){
                System.out.println("continue outer");
                continue outer;
            }
            if(i==5){
                System.out.println("break");
                break;
            }
            if(i==7){
                System.out.println("break outer");
                break outer;
            }
            /*for(int k=0;k<5;k++){
                if(k==3){
                    System.out.println("continue inner");
                    continue inner;
                }
            }
        }
        }*/


        /*for (int i = 0; i < 100; i++) {
            if (i == 74) break;
            if (i % 9 != 0) continue;
            System.out.print(i + " ");
        }
        System.out.println();
        /*for (int i : range(100)) {
            if (i == 74) break;
            if (i % 9 != 0) continue;
            System.out.println(i + " ");
        }
        System.out.println();
        int i = 0;
        while (true) {
            i++;
            int j = i * 27;
            if (i == 1269) break;
            if (i % 10 != 0) continue;
            System.out.println(i + " ");
        }*/
//    }

