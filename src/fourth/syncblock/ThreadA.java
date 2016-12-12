package fourth.syncblock;

public class ThreadA extends Thread{
	
	SyncBlock method;
	
	public ThreadA(SyncBlock method){
		this.method = method;
	}

	@Override
	public void run() {
		Long start = System.currentTimeMillis();
		super.run();
		method.syncBlock();
		Long end = System.currentTimeMillis();
		Long total = end -start;
		System.out.println("ThreadA total time : "+total);
	}
	
}
