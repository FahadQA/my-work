package git;

public class Chilld1 extends Parent

{   // encapsulation demo
	private String email;
	
	public String getemail()
	{
		return email;
	}
	
	public void setemail(String email )
	{
		if(email.indexOf("@")!= -1)
		{
			this.email = email;
			System.out.println("email is :" +getemail());
		}
		else
		{
			System.out.println("email address invalid");
		}
	}
	
	//extends demo
	public void division(int x, int y)
	{
		int division = x/y;
		
		System.out.println("division is :" + division);
		
		
	}
}
