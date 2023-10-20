package ex1;

public class Example1 {
    public static void main(String[] args) {

//  1.
//        ex1.MultiThreadingThing thing = new ex1.MultiThreadingThing();
//        ex1.MultiThreadingThing thing2 = new ex1.MultiThreadingThing();

        // run method can be used but not in concurrency, threads will wait one for another to finish
//  1.
//        thing.start();
//        thing2.start();

//  2.
        for (int i = 0; i < 5; i++) {
            MultiThreadingThing thing = new MultiThreadingThing();
            thing.start();
        }
    }
}
