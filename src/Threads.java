public class Threads {
    public static void main(String[] args) {


        CountNumber countNumber = new CountNumber();
        Runnable runnable = () -> {
            for (int i = 0; i < 1000; i++) {
                countNumber.increment();
            }
        };

        Thread t1 = new Thread(runnable);
        Thread t12 = new Thread(runnable);
        t1.start();
        t12.start();

        try {
            t1.join();
            t12.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(countNumber.getCount());
    }
}

    class CountNumber {

        int count = 0;

       synchronized void increment() {
            count++;
        }


        synchronized int getCount() {
            return count;
        }

    }
