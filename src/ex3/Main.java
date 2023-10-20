package ex3;

public class Main {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            RunnableThread runnableThread = new RunnableThread(i);
            Thread thread = new Thread(runnableThread);

            System.out.println(thread.isAlive());
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            thread.start();
        }
    }
}
