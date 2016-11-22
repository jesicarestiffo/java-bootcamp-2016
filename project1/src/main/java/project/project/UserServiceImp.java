package project.project;


@Service("userService")
public class UserServiceImp implements UserService
{
	private UserDAO userDao;
	
	public void setUserDao(UserDAO userDao) 
	{
		this.userDao = userDao;
	}

	public boolean registerUser(String userName, String password) 
	{
		return userDao.registerUser(userName,password);
	}

	public boolean addProduct(String userName, Product product) 
	{
		return userDao.addProduct(userName, product);
	}

	public boolean removeProduct(String userName, Product product)
	{
		return userDao.removeProduct(userName, product);
	}

	public boolean login(String userName, String password) 
	{
		return userDao.login(userName, password);
	}

}