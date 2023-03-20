public class Test2 {
    int getValue() {
    return 1;
    }
    double getValue(double v) {
    return v;
    }
    public static void main(String[] args) {
    Test2 t = new Test2();
    System.out.println(t.getValue());
    }
}