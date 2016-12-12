package fourth.syncmethod;

public class SyncMethod {

	synchronized public void syncMethod(){
		
		System.out.println("method start !");
		try {
			Thread.sleep(2000);
			System.out.println("syncMethod is running");
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("method end !");
	}
	
}
