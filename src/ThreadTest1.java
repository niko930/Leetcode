import java.util.concurrent.locks.LockSupport;

public class ThreadTest1 {

    static Thread threadA, threadB, threadC;

    /**
     * 三个线程交替打印ABC
     * @param args
     */
    public static void main(String[] args) {

        threadA = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.print(Thread.currentThread().getName());
                LockSupport.unpark(threadB);
                LockSupport.park();
            }
        }, "A");
        threadB = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                LockSupport.park();
                System.out.print(Thread.currentThread().getName());
                LockSupport.unpark(threadC);
            }

        }, "B");
        threadC = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                LockSupport.park();
                System.out.print(Thread.currentThread().getName());
                LockSupport.unpark(threadA);
            }

        }, "C");

        threadA.start();
        threadB.start();
        threadC.start();
    }

}



