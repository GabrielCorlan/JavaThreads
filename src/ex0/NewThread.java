package ex0;

public class NewThread extends Thread {

    @Override
    public void run() {
        System.out.println("I'm running now!");
    }
}
