class MY{
    final int MAX = 20;
    final int NORMAL;
    final int MIN = 1;
    MY(){
        NORMAL = 10;
    }

    final void show(){
        System.out.println("final method");
    }
}
public class finalKeyword {
    public static void main(String[] args) {
        MY m = new MY();
        System.out.println(m.MAX);
        System.out.println(m.MIN);
        System.out.println(m.NORMAL);
        m.show();
    }
}
