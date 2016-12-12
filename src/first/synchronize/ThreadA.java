package first.synchronize;

public class ThreadA extends Thread{
	
	AddNumber add ;
	
	public ThreadA(AddNumber add){
		this.add = add;
	}

	@Override
	public void run() {
		super.run();
		add.add("a");
	}
	
}
