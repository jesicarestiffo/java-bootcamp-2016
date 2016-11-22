package project.project;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import project.project.Product;

public class ProductDAOImp extends HibernateDaoSupport implements ProductDAO
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