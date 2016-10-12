package exerciseThree;

public class Test
{
	public static void main(String args []) 
	{
		Proxy Test = new Proxy ();
		
		FastConnection fastConnection = FastConnection ();
		fastConnection.sayConnected();
		
		Test.sayConnected();
	}

	private static FastConnection FastConnection()
	{
		// TODO Auto-generated method stub
		return null;
	}
}