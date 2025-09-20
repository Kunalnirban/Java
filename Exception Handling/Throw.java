package exception;
//Explicitly throws a single exception object
public class Throw {
    public static void main(String[] args) {
        int age = 10;
        if (age < 18){
            throw new ArithmeticException("not eligible to vote");
        }else {
            System.out.println("eligible to vote");
        }
    }
}
