package project.project;

import java.util.List;


@Service("productService")
public class ProductServiceImp implements ProductService
{
	private ProductDAO productDao;

	public void setProductDao(ProductDAO productDao)
	{
		this.productDao = productDao;
	}

	public List<Product> findProdByCategory(String category)
	{
		return productDao.findProdByCategory(category);
	}

	public Product findProdByName(String name)
	{
		return productDao.findProdByName(name);
	}

}