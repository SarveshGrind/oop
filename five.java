// 5th assingmnet

// Write a java program to solve producer-consumer problem where there are two producer
// threads and one consumer thread.
import java.util.LinkedList;
import java.util.Queue;

// lets hope this works have no experience with vi
// wish me luck 

class SharedBuffer {
    private final Queue<Integer> buffer = new LinkedList<>();
    private final int capacity = 5;
    
    public synchronized void produce(int value) throws InterruptedException{
        while (buffer.size() == capacity) {
            System.out.println("Buffer is full");
            wait();
        }
        buffer.add(value);
        System.out.println("produced: " + value);
        notifyAll();
    }

    public synchronized int consume() throws InterruptedException{
        while (buffer.isEmpty()) {
            System.out.println("Buffer is Empty");
            wait();
        }
        int value = buffer.remove();
        System.out.println("Consumed: " + value);
        notifyAll();
        return value;
    }
}

class Producer extends Thread {
    private final SharedBuffer buffer;
    private final int id;

    public Producer(SharedBuffer buffer, int id){
        this.buffer = buffer;
        this.id = id;
    }

    @Override

    public void run(){
        try {
            while (true) {
                int value = 0;
                buffer.produce(value);
                value++;
                System.out.println("Producer: "+id+" Produced: "+ value);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Consumer extends Thread {
    private final SharedBuffer buffer;

    public Consumer(SharedBuffer buffer){
        this.buffer = buffer;
    }

    @Override

    public void run(){
        try {
            while (true) {
                int value = buffer.consume();
                System.out.println("Consumer consumed : " + value);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


public class five {
    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer();

        Producer producer1 = new Producer(buffer, 1);
        Producer producer2 = new Producer(buffer, 2);

        Consumer consumer = new Consumer(buffer);

        producer1.start();
        producer2.start();
        consumer.start();
    }
}
