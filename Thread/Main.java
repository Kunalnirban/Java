class MyThread extends Thread{
    public void run() {
        System.out.println("MyThread");
    }    
}
public class Main {
    public static void main(String[] args) {
        Thread t = new MyThread();
        t.start();
        for(int i = 0; i<4; i++){
            System.out.println(i);
        }
    }    
}
