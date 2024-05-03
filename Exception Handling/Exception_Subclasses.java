public class Exception_Subclasses {
    public static void performOperation(int a, int b) throws MyException {
        if (a != b) {
            throw new MyException("A is not equal to B");
        }
    }

    public static void main(String[] args) {
        try {
            performOperation(3, 4);
        } catch (MyException e) {
            System.out.println("Exception Message Caught: " + e.getMessage());
        }
    }
}