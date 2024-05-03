public class MultiCatch {
    public static void main(String[] args) {
        int a = 5, b = 0, c;
        try {
            c = a/b;
        } catch (ArrayStoreException e) {
            System.out.println("Exception Caught");
        } catch (ArithmeticException e){
            System.out.println("Exception Caught");
        } finally {
            System.out.println("Exception Resolved");
        }

    }    
}
