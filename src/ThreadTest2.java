import java.util.concurrent.Semaphore;

public class ThreadTest2 {


    private static Semaphore semaphoreA = new Semaphore(1);
    private static Semaphore semaphoreB = new Semaphore(0);
    private static Semaphore semaphoreC = new Semaphore(0);

    private static Thread threadA, threadB, threadC;
    public static void main(String[] args) {
        threadA = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    semaphoreA.acquire();
                    System.out.print(Thread.currentThread().getName());
                    semaphoreB.release();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "A");

        threadB = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    semaphoreB.acquire();
                    System.out.print(Thread.currentThread().getName());
                    semaphoreC.release();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "B");

        threadC = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    semaphoreC.acquire();
                    System.out.print(Thread.currentThread().getName());
                    semaphoreA.release();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "C");

        threadA.start();
        threadB.start();
        threadC.start();
    }

}
