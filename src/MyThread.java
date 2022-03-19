public class MyThread extends Thread {
    private static final int WAIT_TIME = 2500;

    public MyThread(ThreadGroup group, String name) {

        super(group, name);
        start();
    }

    @Override
    public void run() {
        try {
            while (!isInterrupted()) {
                Thread.sleep(WAIT_TIME);
                System.out.println("Я " + getName() + ".Всем привет!");
            }
        } catch (InterruptedException err) {

        } finally {
            System.out.println(getName() + " завершен.");
        }
    }
}
