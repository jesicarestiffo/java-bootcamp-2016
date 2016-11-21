package project.project;

import java.util.List;


public class ProductDAOImp implements ProductDAO
{

	public List<Product> findProdByCategory(String category) 
	{
		@SuppressWarnings("unchecked")
		List<Product> products = getHibernateTemplate().find("from Product where category=?",category);
		return products;
	}

	public Product findProdByName(String name)
	{
		@SuppressWarnings("unchecked")
		List<Product> products = getHibernateTemplate().find("from Product where name=?",name);
		return products.get(0);
	}

}