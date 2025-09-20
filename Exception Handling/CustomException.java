package exception;

class MyException extends Exception {
    MyException(String message) {
        super(message);
    }
}

class DefineException {
    static void validate(int num) throws MyException {
        if (num == 0) {
            throw new MyException("Divide by Zero is not possible");
        }
    }
}

public class CustomException {
    public static void main(String[] args) {
        int a = 10, b = 0;
        try {
            DefineException.validate(b);
        } catch (MyException e) {
            System.out.println("Caught: " + e.getMessage());
        }
        finally {
            System.out.println("Program Terminated Successfully");
        }

    }
}
