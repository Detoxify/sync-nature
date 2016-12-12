package fourth.syncblock;

public class SyncBlock {

	public void syncBlock(){
		
		System.out.println("method start !");
		try {
			Thread.sleep(2000);
			synchronized (this){
				//设置2s延迟，为了验证确实在同步块部分同步执行了
				System.out.println("block in ！ --"+System.currentTimeMillis());
				Thread.sleep(2000);
				System.out.println("syncBlock is running");
				System.out.println("block out ！ --"+System.currentTimeMillis());
			}
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("method end !");
	}
	
}
