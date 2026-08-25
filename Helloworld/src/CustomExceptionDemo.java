class AgeException extends Exception{
	AgeException(String msg){
		super(msg);
	}
	AgeException(){}
}
class Customer2{
	void setAge(int age)throws AgeException{
		if (age < 18 || age > 60)
			throw new AgeException("Age should be between 18 and 60");
		else
			System.out.println("Your Age:"+age);
	
	}
}
public class CustomExceptionDemo {

	public static void main(String[] args) {
		Customer2 c = new Customer2();
        try {
            c.setAge(12);	
        }
        catch(AgeException e) {
        	//System.out.println(e);
        	System.out.println(e.getMessage());
        	e.printStackTrace();
        }
	}

}
