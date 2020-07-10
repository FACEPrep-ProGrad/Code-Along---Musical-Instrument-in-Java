package businesslogic;

public class Validation{
	public boolean adminlogin(String username,String password) {
		
		if(username.equals("admin") && password.equals("admin@123"))
				return true;
		else 
				return false;
	}
}