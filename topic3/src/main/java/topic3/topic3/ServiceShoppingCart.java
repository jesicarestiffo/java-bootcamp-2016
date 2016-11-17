package topic3.topic3;

import java.util.List;

public class ServiceShoppingCart implements Service
{
	private ServiceShoppingCart ssc;
	
	public ServiceShoppingCart()
	{
		ssc = new ServiceShoppingCart();
	}
	
	public void addItem(Item item) 
	{
		ssc.addItem(item);
	}

	public void removeItem(Item item)
	{
		ssc.removeItem(item);
	}

	public List<Item> getItems()
	{
		return ssc.getItems();
	}

}