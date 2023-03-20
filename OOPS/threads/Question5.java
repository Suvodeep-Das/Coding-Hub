class MyRunnableClass implements Runnable {
    public void run() {
    for (int i = 0; i < 5; i++) {
    System.out.println(Thread.currentThread().getName() + " i - " + i);
    try {
    Thread.sleep(100);
    } catch (InterruptedException e) {
    e.printStackTrace();
    }
    }
    }
   }
   public class Question5 {
    public static void main(String[] args) {
    Thread t1 = new Thread(new MyRunnableClass(), "t1");
    Thread t2 = new Thread(new MyRunnableClass(), "t2");
    Thread t3 = new Thread(new MyRunnableClass(), "t3");
    t1.start();
    t2.start();
    t3.start();
    System.out.println("t1 Alive - " + t1.isAlive());
    System.out.println("t2 Alive - " + t2.isAlive());
    System.out.println("t3 Alive - " + t3.isAlive());
    try {
    t1.join();
    t2.join();
    t3.join();
    } catch (InterruptedException e) {
    e.printStackTrace();
    }
    System.out.println("t1 Alive - " + t1.isAlive());
    System.out.println("t2 Alive - " + t2.isAlive());
    System.out.println("t3 Alive - " + t3.isAlive());
    System.out.println("Processing finished");
    }
}
   