package project.project;


public interface UserService 
{
	public boolean registerUser(String username, String password);
	public boolean addProduct(String userName,Product product);
	public boolean removeProduct(String userName,Product product);
	public boolean login(String userName, String password);
}