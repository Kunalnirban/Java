interface A{
    void sum();
}
class B{
    int c = 10, d =20;
}
class C extends B implements A{
    int a = 5, b =10;
    public void sum(){
        System.out.println(a+b);
    }
    void sub(){
        System.out.println(c + d);
    }
}
public class interface_demo {
    public static void main (String[] args){
        C c = new C();
        c.sum();
        c.sub();
    }
}