package exerciseThree;

import java.util.Date;

public abstract class ConnectionDataBase 
{
	public void sayConnected()
	{
		System.out.println (this.getClass().getSimpleName() + "Connected " + new Date());
	}
}
