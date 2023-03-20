class A{
    private int x;
    public A(int x){
    this.x=x;
    }
    public int getX(){
    return this.x;
    }
}
    public class Ques4 {
    public static void main(String[] args) {
    A alpha = null;
    try{
    System.out.println(alpha.getX());
    }catch(RuntimeException e){
    System.out.println(e);
    }
    }
}