package third.multi_lock;

public class TestMain {

	//��������ʵ�����������߳�ʹ��
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
 * ���н��:
 * a set number
 * b set number
 * 200
 * 100
 * 
 * ˵�������̷߳���add����ʱδ��ͬ���ˣ���Ȼ���ʵ�ͬ�����������Ƿ��ʵ��ǲ�ͬ����ķ��������ᱻ��סͬ��ִ�У�ÿ��ʵ�����Լ�����
 */
