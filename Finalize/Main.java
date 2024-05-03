class A{
    A(){
        System.out.println("Default Constructor");
    }

    protected void finalize() {
        System.out.println("Destructor Called");
    }
}
public class Main {
    public static void main(String[] args) {
        A a = new A();
    }
}
