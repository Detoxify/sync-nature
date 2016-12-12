package third.multi_lock;

public class TestMain {

	//创建两个实例对象供两个线程使用
	public static void main(String[] args) {
		
		AddNumber add = new AddNumber();
		AddNumber add1 = new AddNumber();
		
		ThreadA a = new ThreadA(add);
		ThreadB b = new ThreadB(add1);
		
		a.start();
		b.start();
		
	}
	
}

/**
 * 运行结果:
 * a set number
 * b set number
 * 200
 * 100
 * 
 * 说明两个线程访问add方法时未被同步了，虽然访问的同步方法，但是访问的是不同对象的方法，不会被锁住同步执行，每个实例有自己的锁
 */
