package exerciseFour;

public class DataBase 
{
	private String connection;
	private String status;
	private String local;
	
	public String getConnection()
	{
		return connection;
	}
	public void getConnection (String connection)
	{
		this.connection = connection;
	}
	
	public String getStatus()
	{
		return status;
	}
	public void getStatus (String status)
	{
		this.status= status;
	}
	
	public String getLocal()
	{
		return local;
	}
	public void getLocal (String local)
	{
		this.local=local;
	}
	
	public String toString()  
	{
		return "Connection:" + connection + ", Status:" + status + ", Local:" + local;
	}
}
