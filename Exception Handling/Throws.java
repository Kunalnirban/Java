package exception;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Throws {
    public static void main(String[] args) throws Exception {
        String a;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        a = reader.readLine();

        System.out.println(a);
    }
}

/**
 * It is used to indicate that this specific method or class might throw and exception.
 * It is necessary where checked exception is not caught
 * It does not handle the exception — it only tells the caller that they need to handle it.
 * Unchecked exception don't need it, but for clarity we can declare it
 */
