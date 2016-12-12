package first.synchronize;

public class AddNumber {

	int number = 0;
	
	synchronized public void add(String user){
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
