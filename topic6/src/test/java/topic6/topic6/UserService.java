package topic6.topic6;

import java.util.List;


public interface UserService 
{
	public String addUser(String nickname, String name, String surname);
	public String deleteUser(String nickname);
	public String updateUser(String nickname, String name, String surname);
	public User findByName (String name);
	public User findByNickName (String nickName);
	public List<User> getUsers();

}

