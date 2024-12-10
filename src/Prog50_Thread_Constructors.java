class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Hi from run!");
    }
}

public class Prog50_Thread_Constructors {
    public static void main(String[] args) {
        MyThr t = new MyThr("Omkar");
        t.start();
        System.out.println(t.getName());
        System.out.println(t.isAlive());
        System.out.println(t.threadId());
        System.out.println(t.getId());  // 'getId()' is deprecated since version 19
        System.out.println(t.getPriority());       // will be 5 since 5 is normal priority

    }
}
