public class Ques1 {
    public static void main(String[] args) {
        int i = 10;
        try{
            i/=0;
        }catch(RuntimeException e){
            System.out.println(e);
        }
    }
}