package exerciseFour;

public class LocalDataBaseBuilder implements DataBaseBuilder
{
	private DataBase DataBase;
	
	public LocalDataBaseBuilder()
	{
		DataBase= new DataBase ();
	}
	
	@Override
	public void buildConnection ()
	{
		DataBase.getConnection ();
	}
	
	@Override
	public void buildStatus()
	{
		DataBase.getStatus();
	}
	
	@Override
	public void buildLocal()
	{
		DataBase.getLocal();
	}
	
	@Override
	public DataBase getDataBase()
	{
		return DataBase;
	}
}