package topic6.topic6;

public class Item 
{
	private Double price;
	private String name;
	
	public Item(String name, double price)
	{
		this.setName(name);
		this.setPrice(price);
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
}
