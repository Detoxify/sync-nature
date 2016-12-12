package fourth.syncmethod;

public class TestMain {

	public static void main(String[] args) {
		
		SyncMethod method = new SyncMethod();
		
		ThreadA a = new ThreadA(method);
		ThreadB b = new ThreadB(method);
		
		a.start();
		b.start();
		
	}
	
}

/**
 * ���н��:
 * method start !
 * syncMethod is running
 * method end !
 * method start !
 * ThreadA total time : 4000
 * syncMethod is running
 * method end !
 * ThreadB total time : 8000
 * 
 * �����̵߳�����ʱ�䶼��4s��b�߳���a�߳�ִ����֮ǰ���ܽ��뷽��,����b�߳�ִ��ʱ��Ϊ8s
 */