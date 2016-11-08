package exerciseThree;

import java.util.Date;

public class Proxy 
{
	SlowConnection slowConnection;
	
	public Proxy ()
	{
		System.out.println ("Creating proxy at " +new Date ());
	}
	
	public void sayConnected ()
	{
		if (slowConnection == null)
		{
			slowConnection = new SlowConnection();
		}
		slowConnection.sayConnected();
	}
}
