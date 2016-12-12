package second.reentry;

public class Tets {

    public synchronized void method1(){
        System.out.println("method1..");
        method2();
    }
    public synchronized void method2(){
        System.out.println("method2..");
        method3();
    }
    public synchronized void method3(){
        System.out.println("method3..");
    }
    
    public static void main(String[] args) {
        final Tets sd = new Tets();
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                sd.method1();
            }
        });
        t1.start();
    }
}

/**
 * 运行结果:
 * method1..
 * method2..
 * method3..
 * 
 * 说明当一个线程在一对象的同步方法内访问其他同步方法是可重复进入的，若无可重入性会使程序死锁
 */