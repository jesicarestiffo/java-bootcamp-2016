package project.project;

import project.project.Product;

public interface UserDAO 
{
	public boolean registerUser(String userName, String password);
	public boolean addProduct(String userName,Product product);
	public boolean removeProduct(String userName,Product product);
	public boolean login(String userName, String password);

}