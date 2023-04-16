package java8;

public class ThreadExample {
    public static void main(String[] args) {

        // Java7 way
        new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println("Thread run method");
            }
        }).start();

        // Java8 using lambda Expression
        new Thread(()->System.out.println("Thread Run method with start() method")).start();

        // Thread t1=new Thread(()->System.out.println("Thread with Run method"));
    }
}
