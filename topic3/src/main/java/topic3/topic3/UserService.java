package topic3.topic3;

import java.util.List;


public interface UserService 
{
	public void createUser(User user);
	public void deleteUser(User user);
	public void updateUser(User Old, User New);
	public List<User> getUsers();

}