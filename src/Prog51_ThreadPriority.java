class Thr2 extends Thread{
    String name;
    public Thr2(String name){
        super(name);
        this.name = name;
    }

    @Override
    public void run() {
        int i = 0;
        while (i <4){
            System.out.println("Hi from thread " + this.name);
            i++;
        }
    }
}

public class Prog51_ThreadPriority {
    public static void main(String[] args) {
        Thr2 t1 = new Thr2("t1");
        Thr2 t2 = new Thr2("t2");
        Thr2 t3 = new Thr2("t3");
        Thr2 t4 = new Thr2("t4");
        Thr2 t5 = new Thr2("t5");

        t1.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(6);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        // THESE PRIORITIES ALSO DEPEND ON THE OS SO WE CAN'T DIRECTLY ALTER THEM BUT STILL WE
        // CAN HAVE SOME SORT OF CONTROL OVER THEM WITH THIS
    }
}
