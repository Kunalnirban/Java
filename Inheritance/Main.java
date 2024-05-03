class A{
    public int A = 10;
}
class B extends A{
    public int B = 20;
}
class sum extends B{
    void sum(){
        System.out.println("Sum is: " + (A+B));
    }
}
class Main{
    public static void main(String[] args) {
     sum s = new sum();
        s.sum();
    }
}