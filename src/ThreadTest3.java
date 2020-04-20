public class ThreadTest3 {
    private static boolean startA = true;
    private static boolean startB = false;
    private static boolean startC = false;

    public static void main(String[] args) {
        final Object o = new Object();

        new Thread(() -> {
            synchronized (o) {
                for (int i = 0; i < 10; ) {
                    if (startA) {
                        System.out.print(Thread.currentThread().getName());
                        startA = false;
                        startB = true;
                        startC = false;
                        o.notifyAll();
                        i++;
                    } else {
                        try {
                            o.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }, "A").start();

        new Thread(() -> {
            synchronized (o) {
                for (int i = 0; i < 10; ) {
                    if (startB) {
                        System.out.print(Thread.currentThread().getName());
                        startA = false;
                        startB = false;
                        startC = true;
                        o.notifyAll();
                        i++;
                    } else {
                        try {
                            o.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }, "B").start();

        new Thread(() -> {
            synchronized (o) {
                for (int i = 0; i < 10; ) {
                    if (startC) {
                        System.out.print(Thread.currentThread().getName());
                        startA = true;
                        startB = false;
                        startC = false;
                        o.notifyAll();
                        i++;
                    } else {
                        try {
                            o.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }, "C").start();
    }
}
