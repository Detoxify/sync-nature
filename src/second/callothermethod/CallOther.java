package second.callothermethod;

public class CallOther {

	//同步方法，执行时睡眠2s，看能否访问其他使用synchronized和未使用synchronized修饰的方法
	synchronized public void methodOne(){
		System.out.println("synchronized methodOne start!--"+System.currentTimeMillis());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("synchronized methodOne end!");
	}
	
	//同为同步方法的methodTwo
	synchronized public void methodTwo(){
		System.out.println("synchronized methodTwo start!--"+System.currentTimeMillis());
		System.out.println("synchronized methodTwo end!");
	}
	
	//非同步方法的methodThree
	public void methodThree(){
		System.out.println("synchronized methodThree start!--"+System.currentTimeMillis());
		System.out.println("synchronized methodThree end!");
	}
	
}
