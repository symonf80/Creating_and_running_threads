public class Main {
    private static final int SLEEP_TIME = 15000;

    public static void main(String[] args) {
        ThreadGroup mainGroup = new ThreadGroup("main group");
        System.out.println("Создаю потоки...");
        Thread thread1 = new MyThread(mainGroup, "Поток 1");
        Thread thread2 = new MyThread(mainGroup, "Поток 2");
        Thread thread3 = new MyThread(mainGroup, "Поток 3");
        Thread thread4 = new MyThread(mainGroup, "Поток 4");

        try {
            Thread.sleep(SLEEP_TIME);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Завершаю все потоки...");
        mainGroup.interrupt();
    }
}
