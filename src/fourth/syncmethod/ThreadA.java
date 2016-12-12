package fourth.syncmethod;

public class ThreadA extends Thread{
	
	SyncMethod method;
	
	public ThreadA(SyncMethod method){
		this.method = method;
	}

	@Override
	public void run() {
		Long start = System.currentTimeMillis();
		super.run();
		method.syncMethod();
		Long end = System.currentTimeMillis();
		Long total = end -start;
		System.out.println("ThreadA total time : "+total);
	}
	
}
