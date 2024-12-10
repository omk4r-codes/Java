class MyThread1 extends Thread{
    @Override
    public void run() {
        int i = 0;
        while (i < 40000){
            System.out.println("I am Cooking thread");
            System.out.println("I am good!");
            i++;
        }
    }
}

class MyThread2 extends Thread{
    @Override
    public void run() {
        int i = 0;
        while (i < 40000){
            System.out.println("I am Chatting on whatsapp thread");
            System.out.println("idgaf");
            i++;
        }
    }
}

public class Prog48_Multithreading {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();     // thread started
        t2.start();
    }
}
