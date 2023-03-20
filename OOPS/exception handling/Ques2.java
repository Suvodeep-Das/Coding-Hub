public class Ques2 {
    public static void main(String[] args) {
    int[] A = {1,2,3,4,5};
    try{
    System.out.println(A[6]);
    } catch(RuntimeException e){
    System.out.println(e);
    }
    String S = "Computer";
    try{
    System.out.println(S.charAt(10));
    } catch(RuntimeException e){
    System.out.println(e);
    }
    }
}