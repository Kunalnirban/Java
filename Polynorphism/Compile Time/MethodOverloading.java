class A{
    void sum(){
        System.out.println("Sum Method Called");
    }
    void sum(int a, int b, int c){
        System.out.println("Sum = " + (a+b+c));
    }
    void sum(double a, double b, double c){
        System.out.println("Sum = " + (a+b+c));
    }
}

public class MethodOverloading{ //Same Name Different parameters
    public static void main(String[] args) {
        A a = new A();
        a.sum();
        a.sum(12, 12, 16);
        a.sum(12.7, 12.1, 16.2);
        
    }
}