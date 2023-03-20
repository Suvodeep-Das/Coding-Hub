public class Question1 extends Thread {
    Question1(String name) {
    super(name);
    System.out.println("Started");
    }
    public void run() {
    for (int i = 0; i < 3; i++) {
    System.out.println(this.getName());
    try {
    this.sleep(1000);
    } catch (Exception e) {
    System.out.println(e);
    }
    }
    }
    public static void main(String[] args) {
    Question1 q1 = new Question1("Das");
    System.out.println(Thread.currentThread().getName());
    System.out.println("Suvodeep : " + q1.getName());
    q1.start();
    try {
    q1.join();
    } catch (Exception e) {
    System.out.println(e);
    }
    System.out.println("Main exited");
    }
}
   