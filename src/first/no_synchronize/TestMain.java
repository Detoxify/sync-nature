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
 * ���н��:
 * a set number
 * b set number
 * 200
 * 200
 * 
 * ˵�������̷߳���add����ʱδ��ͬ���ˣ�a��bͬʱ���ʣ���������ִ���
 */
