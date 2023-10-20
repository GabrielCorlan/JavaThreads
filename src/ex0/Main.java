package ex0;

import java.util.Set;

public class Main {
    public static void main(String[] args) {

        // see how many threads are operating now
        System.out.println(Thread.activeCount());

        // see the names of operating threads

//        Thread.getAllStackTraces().keySet().forEach((t)
//                -> System.out.println(
//                        t.getName() + "\nIs Daemon " + t.isDaemon() + "\nIs Alive " + t.isAlive())
//        );

//        Set<Thread> threadSet = Thread.getAllStackTraces().keySet();
//
//        for (var th : threadSet) {
//            System.out.println(th + " " + th.isDaemon());
//        }
        System.out.println(Thread.currentThread().getName() + " is running now");

        // change the default name of the Thread
        Thread.currentThread().setName("Mircea");
        System.out.println(Thread.currentThread().getName() + " is running now");

        // see the priority of the current thread
        System.out.println("The priority of " + Thread.currentThread().getName()
                + " is " + Thread.currentThread().getPriority());

        // change the priority of the current thread
        Thread.currentThread().setPriority(1);
        System.out.println("The priority of " + Thread.currentThread().getName()
                + " is " + Thread.currentThread().getPriority());

        // see if current thread is alive
        System.out.println("Is " + Thread.currentThread().getName() + " alive? "
                + Thread.currentThread().isAlive());

        NewThread newThread = new NewThread();
        System.out.println("My name is " + newThread.getName());
        System.out.println("Is " + newThread.getName() + " alive? " + newThread.isAlive());
        newThread.start();
        System.out.println("The priority of " + newThread.getName()
                + " is " + newThread.getPriority());
        System.out.println("Is " + newThread.getName() + " alive? " + newThread.isAlive());


    }
}
