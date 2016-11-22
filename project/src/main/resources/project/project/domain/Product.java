package project.project;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;



public class Product 
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idProduct")
	private int idProduct;
	
	@Column(name="name")
	private String name;
	
	@Column(name="price")
	private double price;
	
	@Column(name="category")
	private String category;
	
	@ManyToMany(cascade = {javax.persistence.CascadeType.ALL})
	@JoinTable(name="prod_user", joinColumns={@JoinColumn(name="idProduct")}, 
	 			inverseJoinColumns={@JoinColumn(name="idUser")})
	private List<User> users = new ArrayList<User>();

	public Product(int idProduct, String name, double price, String category) 
	{
		this.idProduct = idProduct;
		this.name = name;
		this.price = price;
		this.category = category;
	}
	
	public Product(){}

	public int getIdProduct() 
	{
		return idProduct;
	}

	public void setIdProduct(int idProduct) 
	{
		this.idProduct = idProduct;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public double getPrice() 
	{
		return price;
	}

	public void setPrice(double price)
	{
		this.price = price;
	}

	public String getCategory()
	{
		return category;
	}

	public void setCategory(String category)
	{
		this.category = category;
	}

	public void setUsers(List<User> users)
	{
		this.users = users;
	}
}