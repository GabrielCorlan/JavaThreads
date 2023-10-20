package ex2;

public class AnotherThread extends Thread {

    int counter;

    public AnotherThread(int counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " from thread " + counter);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ignored) {}
        }
    }
}
