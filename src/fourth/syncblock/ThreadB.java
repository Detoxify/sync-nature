package fourth.syncblock;

public class ThreadB extends Thread{
	
	SyncBlock method;
	
	public ThreadB(SyncBlock method){
		this.method = method;
	}

	@Override
	public void run() {
		Long start = System.currentTimeMillis();
		super.run();
		method.syncBlock();
		Long end = System.currentTimeMillis();
		Long total = end -start;
		System.out.println("ThreadB total time : "+total);
	}
	
}
