package exception;
public class TryCatch {
    public static void main(String[] args) {
        int a = 10, b = 0;
        try{
            System.out.println(a/b);
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Program Terminated!");
        }
    }
}
