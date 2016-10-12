package exerciseFour;

public class DataBaseDirector 
{
	private DataBaseBuilder DataBaseBuilder = null;
	
	public DataBaseDirector(DataBaseBuilder dataBaseBuilder2)
	{
		this.DataBaseBuilder =DataBaseBuilder;
	}
	
	public void constructDataBase()
	{
		DataBaseBuilder.buildConnection();
		DataBaseBuilder.buildStatus ();
		DataBaseBuilder.buildLocal ();
	}
	
	public DataBase getDataBase()
	{
		return DataBaseBuilder.getDataBase();
	}
}