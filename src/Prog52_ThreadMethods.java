class Thread1 extends Thread{
    @Override
    public void run() {
        int i = 0;
        while (i <40){
            System.out.println("Hi from thread 1");
            i++;
            try {
                Thread.sleep(1000); // it'll sleep for 1000 ms after every iteration
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class Thread2 extends Thread{
    @Override
    public void run() {
        int i = 0;
        while (i <40){
            System.out.println("Hi from thread 2");
            i++;
        }
    }
}

public class Prog52_ThreadMethods {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t1.start();
//        try {
//            t1.join();  // JAB TAK T1 COMPLETE NAHI HOTA T2 WON'T START
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }
        t2.start();
    }
}
