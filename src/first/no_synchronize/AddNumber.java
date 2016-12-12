package first.no_synchronize;

public class AddNumber {

	int number = 0;
	
	//未对该方法进行同步，所以多个线程不会阻塞
	public void add(String user){
		if(user.equals("a")){
			number = 100 ; 
			System.out.println("a set number");
		}else{
			number = 200 ;
			System.out.println("b set number");
		}
		System.out.println(number);
	}
	
}
