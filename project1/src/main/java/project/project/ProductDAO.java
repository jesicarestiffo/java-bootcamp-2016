package project.project;

import java.util.List;


public interface ProductDAO
{
	public List<Product> findProdByCategory(String category);
	public Product findProdByName(String name);

}