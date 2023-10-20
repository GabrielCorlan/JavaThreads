package ex5;

public class MainLambda {

    public static void main(String[] args) {

        Thread countAscending = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread #1: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            }
        });

        Thread countDescending = new Thread(() -> {
            for (int i = 5; i > 0; i--) {
                System.out.println("Thread #2: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            }
        });

        countAscending.start();
//        try {
//            countAscending.join();
//        } catch (InterruptedException e) {
//        }
        countDescending.start();

    }
}
