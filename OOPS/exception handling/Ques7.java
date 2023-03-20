class UDException extends RuntimeException{
    public UDException(String e){
    super(e);
    }
}
    class A{
    public void f(){
    try{
    System.out.println("Function F");
    this.g();
    }catch(RuntimeException e){
    System.out.println(e);
    }
    }
    public void g() {
    System.out.println("Function G");
    throw new UDException("User Defined Exception");
    }
}
    public class Ques7 {
    public static void main(String[] args) {
    A alpha = new A();
    alpha.f();
    }
}