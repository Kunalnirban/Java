package exception;

import java.io.IOException;

class PossibleException{
    static void possibeMethod() throws Exception {
     boolean error = true;
     if(error){
         throw new Exception("Something gone wrong");
     }
    }
}
public class ThrowUse {
    public static void main(String[] args) {
        try {
            PossibleException.possibeMethod();
        }catch (Exception e){
            System.out.println("Caught: " + e.getMessage());
        }
    }
}
