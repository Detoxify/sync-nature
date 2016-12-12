package first.no_synchronize;

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
 * b set number
 * 200
 * 200
 * 
 * 说明两个线程访问add方法时未被同步了，a、b同时访问，最后结果出现错误。
 */
