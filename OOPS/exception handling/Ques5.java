class PayOutOfBoundsException extends RuntimeException{
    public PayOutOfBoundsException(String e){ super(e); }
}
public class Ques5 {
    public static void main(String[] args) {
        int salary = 9000;
        try{
            if(salary<10000){
                throw new PayOutOfBoundsException("Provided monthly salary of a person is less than    Rs. 10,000");
            } else {
                System.out.println("Monthly Salary is "+salary); 
            }
        }catch(RuntimeException e){ 
            System.out.println(e); 
        } 
    } 
}
 
    