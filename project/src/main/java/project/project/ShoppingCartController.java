package project.project;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shoppingcart.domain.Product;
import com.shoppingcart.services.ProductService;
import com.shoppingcart.services.UserService;

@Controller
@RequestMapping("/sc")

public class ShoppingCartController 
{
	@Resource(name="userService")
	private UserService userService;
	@Resource(name="productService")
	private ProductService productService;
	
	@RequestMapping(value = "products/{category}", method = RequestMethod.GET,
					headers = "Accept=application/xml, application/json")
	@ResponseBody
	public List<Product> findProdByCategory(@PathVariable String category) 
	{
		List<Product> products = productService.findProdByCategory(category);
		return products;
	}
	
	@RequestMapping(value = "product/{name}", method = RequestMethod.GET, 
					headers = "Accept=application/xml, application/json")
	@ResponseBody
	public Product findProdByName(@PathVariable String name)
	{
		Product product = productService.findProdByName(name);
		return product;
	}
	
	@RequestMapping(value = "register/{username}/{password}", method = {RequestMethod.POST,RequestMethod.GET},
					headers = "Accept=application/xml, application/json")
	@ResponseBody
	public String register(@PathVariable String username, @PathVariable String password)
	{
		if(userService.registerUser(username,password))
		{
			return "Registration successful";
		}
		return "The user already exists";
	}
	
	@RequestMapping(value = "login/{username}/{password}", method = RequestMethod.GET,
					headers = "Accept=application/xml, application/json")
	@ResponseBody
	public String login(@PathVariable String username,@PathVariable String password)
{
		if(userService.login(username, password))
		{
			return "Login correct";
		}
		return "Fail login";
	}
	
	@RequestMapping(value = "buy/{username}/{product}", method = {RequestMethod.POST,RequestMethod.GET},
					headers = "Accept=application/xml, application/json")
	@ResponseBody
	public String buyProduct(@PathVariable String username,@PathVariable String product)
	{ 
		Product p = productService.findProdByName(product);
		if(userService.addProduct(username, p))
		{
			return "Product added to cart";
		}
		return "Unable to add product to cart, check the data";
	}
	
	@RequestMapping(value = "delete/{username}/{product}", method = { RequestMethod.DELETE,RequestMethod.GET },
					headers = "Accept=application/xml, application/json")
	@ResponseBody
	public String leaveProduct(@PathVariable String username,@PathVariable String product) 
	{
		Product p = productService.findProdByName(product);
		if(userService.removeProduct(username, p)){
			return "Product removed from the cart";
		}
		return "Unable to remove product to cart, check the data";
	}
}