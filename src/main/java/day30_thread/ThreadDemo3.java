package day30_thread;
class RunningThread extends Thread{
    @Override
   public void run(){
        System.out.println("RunningThread ...");
   }
}
class RunningRunnable implements Runnable{
    @Override
   public void run(){
        System.out.println("RunningRunnable ...");
   }
}
public class ThreadDemo3 {
    public static void main(String[] args) {
        RunningThread rt = new RunningThread();
        rt.start();
        
        RunningRunnable rr = new RunningRunnable();
        Thread t =new Thread(rr);
        t.start();
        
        //Java8
        Runnable r = ()->System.out.println("Java 8 Runnable....");
        Thread t2 = new Thread(r);
        t2.start();
    }
}
