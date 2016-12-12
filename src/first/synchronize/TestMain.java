package first.synchronize;

public class TestMain {

	public static void main(String[] args) {
		
		AddNumber add = new AddNumber();
		
		ThreadA a = new ThreadA(add);
		ThreadB b = new ThreadB(add);
		
		a.start();
		b.start();
		
	}
	
}

/**
 * 运行结果:
 * a set number
 * 100
 * b set number
 * 200
 * 
 * 说明两个线程访问add方法时被同步了，a线程先执行，执行完毕后，b线程执行。
 */