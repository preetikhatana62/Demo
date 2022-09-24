package hello;

public class encapsulation 
{
	String user_id="preeti001";
	int pwd=123;
	int new_pwd=789;
	
	public void  getPwd() {
		System.out.println( pwd);
	}


	public void setPwd(int pwd)
	{
		if(this.pwd !=pwd)
		{
			System.out.println( new_pwd );
		}
		else
		{ 
			System.out.println("invalid password" );
		}
	}

public void getNew_pwd() {
		System.out.println( new_pwd);
	}


	public void setNew_pwd(int new_pwd) {
		this.new_pwd = new_pwd;
	}


public static void main(String [] args) 
{ 
	encapsulation  ob= new encapsulation();
	
	System.out.println(ob.user_id);
	ob.setPwd(456);
	//ob.getPwd();
	//ob.setNew_pwd(897);
	//ob.getNew_pwd();
}
	
}
	


