package fourth.syncmethod;

public class ThreadB extends Thread{
	
	SyncMethod method;
	
	public ThreadB(SyncMethod method){
		this.method = method;
	}

	@Override
	public void run() {
		Long start = System.currentTimeMillis();
		super.run();
		method.syncMethod();
		Long end = System.currentTimeMillis();
		Long total = end -start;
		System.out.println("ThreadB total time : "+total);
	}
	
}
