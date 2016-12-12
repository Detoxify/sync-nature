package second.callothermethod;

public class ThreadA extends Thread{
	
	CallOther call ;
	
	public ThreadA(CallOther add){
		this.call = add;
	}

	@Override
	public void run() {
		super.run();
		call.methodOne();
	}
	
}
