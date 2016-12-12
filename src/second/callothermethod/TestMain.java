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
 * ���н��:
 * synchronized methodOne start!--1481531222285
 * synchronized methodThree start!--1481531222286
 * synchronized methodThree end!
 * synchronized methodOne end!
 * synchronized methodTwo start!--1481531227287
 * synchronized methodTwo end!
 * 
 * ���˵����ͬ������methodOneִ��ʱ�������߳��޷�����ͬΪͬ���̵߳�methodTwo�����ǿ��Է��ʷ�ͬ����methodThree
 */
