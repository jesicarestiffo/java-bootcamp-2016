package topic6.topic6;

public class User 
{
	private String name;
	private String surname;
	private String nickName;
	
	public User(String name, String surname, String nickName) 
	{
	
		this.name = name;
		this.surname = surname;
		this.nickName = nickName;
	
	}
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	} 
	
	public String getSurname()
	{
		return surname;
	}
	
	public void setSurname (String surname)
	{
		this.surname = surname;
	}
	
	public String getNickName()
	{
		return nickName;
	}
	
	public void setNickName(String nickName)
	{
		this.nickName = nickName;
	}
	
}
