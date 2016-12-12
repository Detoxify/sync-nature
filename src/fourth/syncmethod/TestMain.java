package fourth.syncmethod;

public class TestMain {

	public static void main(String[] args) {
		
		SyncMethod method = new SyncMethod();
		
		ThreadA a = new ThreadA(method);
		ThreadB b = new ThreadB(method);
		
		a.start();
		b.start();
		
	}
	
}

/**
 * 运行结果:
 * method start !
 * syncMethod is running
 * method end !
 * method start !
 * ThreadA total time : 4000
 * syncMethod is running
 * method end !
 * ThreadB total time : 8000
 * 
 * 两个线程的运行时间都是4s，b线程在a线程执行完之前不能进入方法,所以b线程执行时间为8s
 */