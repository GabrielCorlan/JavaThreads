package ex2;

import ex2.AnotherThread;

class Main {

    public static void main(String[] args) {

        System.out.println("This is the main thread.");

        System.out.println(Thread.activeCount());

        for (int i = 1; i <= 5; i++) {
            AnotherThread anotherThread = new AnotherThread(i);
//            anotherThread.setName("Thread number " + i);
//            if(anotherThread.counter == 3) {
//                throw new RuntimeException();
//            }
            anotherThread.start();

//            try {
//                anotherThread.join();
//            } catch (InterruptedException ignored) {}
        }
        System.out.println(Thread.activeCount());

        System.out.println(Thread.currentThread().getName());

        System.out.println(Thread.currentThread().getPriority());

//        ex2.AnotherThread anotherThread2 = new ex2.AnotherThread();
//        anotherThread2.start();





    }
}









