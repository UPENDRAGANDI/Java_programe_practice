class SharedBuffer {
//    private int data;
//    private boolean hasData = false;
//
//    public synchronized void produce(int value) {
//        while (hasData) {
//            try {
//                wait(); // Wait until data is consumed
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//        this.data = value;
//        hasData = true;
//        System.out.println("Produced: " + value);
//        notify(); // Notify the consumer
//    }
//
//    public synchronized void consume() {
//        while (!hasData) {
//            try {
//                wait(); // Wait until data is produced
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//        System.out.println("Consumed: " + data);
//        hasData = false;
//        notify(); // Notify the producer
//    }

    boolean isDataAvailable = false;

    synchronized void produce() {
        System.out.println("Producer started");
        isDataAvailable = true;
        notify();  // Notify the consumer that data is available
        System.out.println("Producer notified");
    }

    synchronized void consume() {
        while (!isDataAvailable) {
            try {
                System.out.println("Consumer waiting");
                wait();  // Releases lock and waits
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Consumer consumed the data");
    }


}

public class WaitNotifyExample {
    public static void main(String[] args) {
//        SharedBuffer buffer = new SharedBuffer();
//
//        Thread producer = new Thread(() -> {
//            for (int i = 1; i <= 5; i++) {
//                buffer.produce(i);
//                try {
//                    Thread.sleep(500); // Simulate time taken to produce
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//
//        Thread consumer = new Thread(() -> {
//            for (int i = 1; i <= 5; i++) {
//                buffer.consume();
//                try {
//                    Thread.sleep(800); // Simulate time taken to consume
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//
//        producer.start();
//        consumer.start();


        SharedBuffer resource = new SharedBuffer();

        Thread consumerThread = new Thread(() -> resource.consume());
        Thread producerThread = new Thread(() -> resource.produce());

        consumerThread.start();
        try { Thread.sleep(1000); } catch (Exception e) {}
        producerThread.start();
   }
}
