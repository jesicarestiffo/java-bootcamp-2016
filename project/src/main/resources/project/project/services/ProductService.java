package project.project;

import java.util.List;

import project.project.Product;

public interface ProductService 
{
	public List<Product> findProdByCategory(String category);
	public Product findProdByName(String name);
}