public class Test {
    int getValue() {
    return 1;
    }
    double getValue() {
    return 2.0;
    }
    public static void main(String[] args) {
    Test t = new Test();
    System.out.println(t.getValue());
    }
}