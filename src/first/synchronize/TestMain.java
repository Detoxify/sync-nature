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
 * ���н��:
 * a set number
 * 100
 * b set number
 * 200
 * 
 * ˵�������̷߳���add����ʱ��ͬ���ˣ�a�߳���ִ�У�ִ����Ϻ�b�߳�ִ�С�
 */