class MyThread implements Runnable {
    public void run() {
      for (int i = 0; i < 5; i++) {
        System.out.println("Child Thread: " + i);
      }
    }
  }
  
  public class RunnableThread {
    public static void main(String[] args) {
      Thread t = new Thread(new MyThread());
      t.start();
      for (int i = 0; i < 4; i++) {
        System.out.println("Main Thread: " + i);
      }
    }
  }
  