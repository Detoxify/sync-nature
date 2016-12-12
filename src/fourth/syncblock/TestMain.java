package fourth.syncblock;

public class TestMain {

	public static void main(String[] args) {
		
		SyncBlock method = new SyncBlock();
		
		ThreadA a = new ThreadA(method);
		ThreadB b = new ThreadB(method);
		
		a.start();
		b.start();
		
	}
	
}

/**
 * ���н��:
 * method start !
 * method start !
 * block in �� --1481534385923
 * syncBlock is running
 * block out �� --1481534387923
 * block in �� --1481534387923
 * syncBlock is running
 * method end !
 * block out �� --1481534389924
 * ThreadA total time : 6001
 * method end !
 * ThreadB total time : 8001
 * 
 * a��b�̳߳���ͬ������鲿��ͬ��ִ�У�Ч����ߣ�������2s��Ϊ����֤��ͬ�����У������߳�ͬ��ִ����
 */