package fourth.syncblock;

public class SyncBlock {

	public void syncBlock(){
		
		System.out.println("method start !");
		try {
			Thread.sleep(2000);
			synchronized (this){
				//����2s�ӳ٣�Ϊ����֤ȷʵ��ͬ���鲿��ͬ��ִ����
				System.out.println("block in �� --"+System.currentTimeMillis());
				Thread.sleep(2000);
				System.out.println("syncBlock is running");
				System.out.println("block out �� --"+System.currentTimeMillis());
			}
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("method end !");
	}
	
}
