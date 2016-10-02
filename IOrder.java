package wineshop.orders;

import java.util.Collection;

public interface IOrder {
	boolean addProduct(Product p);
	boolean removeProduct(String name) throws ProductNotFoundException;
	Collection<Product> getCartDetails();
	Product getProductFromCart(String name) throws ProductNotFoundException;
	int productCount();
  double getCartPrice();
}
