package exerciseOne;

public class Singleton 
{
	private static Singleton singleton = null;
	
	private Singleton ()
	{
		
	}
		public static Singleton getInstance ()
		{
			if (singleton == null)
			{
				singleton = new Singleton();
			}
			return singleton;
		}
		
		public void connected ()
		{
			System.out.println ("Connected to data base");
		}
	}