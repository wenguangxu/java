package base.exceptionTest;

public class MyException extends Exception{
	
	private int id;
	
	public MyException(String message,int id){
		super(message);
		this.id = id;
	}
	
	public int getId(){
		return id;
	}
	
}
