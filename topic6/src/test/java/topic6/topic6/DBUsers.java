package topic6.topic6;

import java.util.ArrayList;
import java.util.List;


public class DBUsers
{
	private List<User> users;

	public DBUsers() 
	{
		this.users = new ArrayList<User>();
	}
	
	public List<User> getUsers()
	{
		return users;
	}
	
	public boolean containsUser(User user)
	{
		for(User u: users)
		{
			if(u.getName().equals(user.getName()) && u.getSurname().equals(user.getSurname()))
			{
						return true;
			}
			
		}
		
		return false;
	}
	
	public void addUser(User user)
	{
		users.add(user);
	}
	
	public void removeUser(User user)
	{
		users.remove(user);
	}
	
}
