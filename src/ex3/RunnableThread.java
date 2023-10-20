package ex3;

public class RunnableThread implements Runnable {

    // the major advantage by implementing the Runnable interface is that after that you can extend other class also

    int counter;

    public RunnableThread(int counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " from thread " + counter);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ignored) {
            }
        }
    }
}

