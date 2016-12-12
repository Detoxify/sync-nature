package second.callothermethod;

public class TestMain {

	public static void main(String[] args) {
		
		CallOther add = new CallOther();
		
		ThreadA a = new ThreadA(add);
		ThreadB b = new ThreadB(add);
		ThreadC c = new ThreadC(add);
		
		
		a.start();
		b.start();
		c.start();
		
	}
	
}

/**
 * 运行结果:
 * synchronized methodOne start!--1481531222285
 * synchronized methodThree start!--1481531222286
 * synchronized methodThree end!
 * synchronized methodOne end!
 * synchronized methodTwo start!--1481531227287
 * synchronized methodTwo end!
 * 
 * 结果说明当同步方法methodOne执行时，其他线程无法访问同为同步线程的methodTwo，但是可以访问非同步的methodThree
 */
