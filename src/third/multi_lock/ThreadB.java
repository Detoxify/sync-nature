package third.multi_lock;

public class ThreadB extends Thread{
	
	AddNumber add;
	
	public ThreadB(AddNumber add){
		this.add = add;
	}

	@Override
	public void run() {
		super.run();
		add.add("b");
	}
	
}
