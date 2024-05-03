class Constructor {
    private int a, b;

    Constructor() {
        System.out.println("Constructor Constructor");
    }

    Constructor(int a, int b) {
        System.out.println("Parameterized constructor");
        sum(a, b);
    }

    Constructor(Constructor original) {
        System.out.println("Copy Constructor");
        this.a = original.a;
        this.b = original.b;
    }

    void sum(int a, int b) {
        System.out.println("Sum = " + (a + b));
    }
}

public class Main {
    public static void main(String[] args) {
        Constructor D = new Constructor();
        Constructor A = new Constructor(12, 15);
        Constructor copy = new Constructor(A);
    }
}
