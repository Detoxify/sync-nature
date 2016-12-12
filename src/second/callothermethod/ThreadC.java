package second.callothermethod;

public class ThreadC extends Thread{
	
	CallOther call ;
	
	public ThreadC(CallOther add){
		this.call = add;
	}

	@Override
	public void run() {
		super.run();
		call.methodThree();
	}
	
}
