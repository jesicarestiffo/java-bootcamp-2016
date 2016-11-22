package project.project;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;



public class UserDAOImp extends HibernateDaoSupport implements UserDAO
{
	
	public boolean userExists(String userName)
	{
		@SuppressWarnings("unchecked")
		List<User> u = getHibernateTemplate().find("from User where userName = ?", userName);
		if(u.size() == 0)
		{
			return false;
		}
		return true;
	}
	
	public boolean registerUser(String userName, String password) 
	{
		if (!userExists(userName)) 
		{
			User user = new User();
			user.setUsername(userName);
			user.setPassword(password);
			getHibernateTemplate().save(user);
			return true;
		}
		return false;
	}

	public boolean login(String userName, String password)
	{
		Object [] params = {userName,password};
		@SuppressWarnings("unchecked")
		List<User> user = getHibernateTemplate().find("from User where userName = ? and password = ?",params);
		if(user.size() != 0 && user.get(0).getUsername().equals(userName) && user.get(0).getPassword().equals(password))
		{
			return true;
		}
		return false;
	}

	public boolean addProduct(String userName, Product product) 
	{
		if (userExists(userName))
		{
			User user = getUser(userName);
			ProdUser p = new ProdUser();
			p.setIdProduct(product.getIdProduct());
			p.setIdUser(user.getIdUser());
			getHibernateTemplate().save(p);
			return true;
		}
		return false;
	}

	public boolean removeProduct(String userName, Product product) 
	{
		if (userExists(userName)) {
			User user = getUser(userName);
			ProdUser p = new ProdUser();
			p.setIdProduct(product.getIdProduct());
			p.setIdUser(user.getIdUser());
			getHibernateTemplate().delete(p);
			return true;
		}
		return false;
	}
	
	public User getUser(String userName)
	{
		@SuppressWarnings("unchecked")
		List<User> user = getHibernateTemplate().find("from User where userName = ?", userName);
		return user.get(0);
	}
}