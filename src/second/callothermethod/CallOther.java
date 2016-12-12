package second.callothermethod;

public class CallOther {

	//ͬ��������ִ��ʱ˯��2s�����ܷ��������ʹ��synchronized��δʹ��synchronized���εķ���
	synchronized public void methodOne(){
		System.out.println("synchronized methodOne start!--"+System.currentTimeMillis());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("synchronized methodOne end!");
	}
	
	//ͬΪͬ��������methodTwo
	synchronized public void methodTwo(){
		System.out.println("synchronized methodTwo start!--"+System.currentTimeMillis());
		System.out.println("synchronized methodTwo end!");
	}
	
	//��ͬ��������methodThree
	public void methodThree(){
		System.out.println("synchronized methodThree start!--"+System.currentTimeMillis());
		System.out.println("synchronized methodThree end!");
	}
	
}
