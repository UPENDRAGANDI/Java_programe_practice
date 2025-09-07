
import java.util.concurrent.*;

public class MultiThreading {
    public static void main(String[] args) throws InterruptedException {


        CounterThread counterThread = new CounterThread();
//        Thread t1 = new Thread(counterThread);
//        Thread t2 = new Thread(counterThread);
//        Thread t3 = new Thread(counterThread);
//        Thread t4 = new Thread(counterThread);
//
//        t1.start();
//
//        t2.start();
//
//        t3.start();
//
//        t4.start();

        ExecutorService es = Executors.newCachedThreadPool();
        for (int i = 0; i < 25; i++) {
            es.submit(counterThread);

        }


    }

}

class CounterThread implements Runnable {

      int count = 0;




    @Override
    public void run() {
        count += 1;
        System.out.println( Thread.currentThread().getName()+" "+"countNumber" + " " + count);

    }
}
