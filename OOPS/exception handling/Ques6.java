public class Ques6 {
    public static void main(String[] args) {
    int a=10;
    int b=0;
    try{
    if(b==0){
    throw new ArithmeticException("Cannot Divide by Zero");
    }else{
    System.out.println("The Value: "+a/b);
    }
    }catch(RuntimeException e){
    System.out.println(e);
    }
    }
}
    