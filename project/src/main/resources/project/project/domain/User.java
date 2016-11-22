package project.project;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User 
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idUser")
	private int idUser;
	
	@Column(name="username")
	private String username;
	
	@Column(name="password")
	private String password;
	
	@ManyToMany(mappedBy="users")
	private List<Product> products = new ArrayList<Product>();

	public User(int idUser, String username, String password)
	{
		this.idUser = idUser;
		this.username = username;
		this.password = password;
	}
	
	public User(){}
	
	public int getIdUser()
	{
		return idUser;
	}

	public void setIdUser(int idUser)
	{
		this.idUser = idUser;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public String getUsername()
	{
		return username;
	}

	public void setUsername(String username) 
	{
		this.username = username;
	}

	public List<Product> getProducts() 
	{
		return products;
	}

	public void setProducts(List<Product> products)
	{
		this.products = products;
	}
	
}