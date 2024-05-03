import java.io.*;
import java.util.*;
public class BufferReader_Main {
    public static void main(String[] args) throws IOException{
     BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

     System.out.print("Enter your name: ");   
     String name  = reader.readLine();

     System.out.println("Tell me your age: ");
     int Age = Integer.parseInt(reader.readLine());

     System.out.println("Name: " + name +" Age: "+ Age);
    }
}