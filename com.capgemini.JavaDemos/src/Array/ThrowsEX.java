package Array;

import java.io.IOException;
import java.sql.SQLException;

public class ThrowsEX {
	//dev 1
	
	
	void m1() throws ArithmeticException
	{
		try {
			throw new ArithmeticException("Condition is not accepted");
		} catch (Exception e) {
			e.printStackTrace();
		}
		//System.out.println("method 1 is created");
	}
	
		//dev 2
	void m2() throws IOException
	{
		System.out.println("method 2 is created");

	}
	
	//dev 3
	void m3() throws SQLException
	{
		System.out.println("method 3 is created");

	}
	
	
	

	public static void main(String[] args) throws Exception {
		
		ThrowsEX obj=new ThrowsEX();
		obj.m1();
		obj.m2();
		obj.m3();

	}

}
