package second.callothermethod;

public class ThreadB extends Thread{
	
	CallOther call ;
	
	public ThreadB(CallOther add){
		this.call = add;
	}

	@Override
	public void run() {
		super.run();
		call.methodTwo();
	}
	
}
