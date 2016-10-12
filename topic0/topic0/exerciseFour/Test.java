package exerciseFour;

public class Test 
{
	public static void main(String[] args) 
	{
		DataBaseBuilder DataBaseBuilder =  new LocalDataBaseBuilder();
		DataBaseDirector DataBaseDirector = new DataBaseDirector (DataBaseBuilder);
		DataBaseDirector.constructDataBase();
		DataBase DataBase = DataBaseDirector.getDataBase();
		System.out.println("Local Data Base is : " + DataBase);
		
		DataBaseBuilder = new ConnectionBuilder();
		DataBaseDirector = new DataBaseDirector (DataBaseBuilder);
		DataBaseDirector.constructDataBase();
		DataBase = DataBaseDirector.getDataBase();
		System.out.println("Connection is: " + DataBase);
		
		
	}
}
