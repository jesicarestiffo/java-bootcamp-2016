package project.project;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="prod_user")
public class ProdUser implements Serializable
{

	@Id
	@Column(name="idUser")
	private int idUser;
	
	@Id
	@Column(name="idProduct")
	private int idProduct;

	public ProdUser(int idUser, int idProduct) 
	{
		this.idUser = idUser;
		this.idProduct = idProduct;
	}
	
	public ProdUser(){}

	public int getIdUser()
	{
		return idUser;
	}

	public void setIdUser(int idUser)
	{
		this.idUser = idUser;
	}

	public int getIdProduct()
	{
		return idProduct;
	}

	public void setIdProduct(int idProduct)
	{
		this.idProduct = idProduct;
	}
}