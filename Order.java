package wineshop.orders;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Collection;
 
public class Order implements IOrder {
	
	public String uid;
	private Map<String, Product> map;
	
	public Order(){}
	public Order(String uid){
		this.uid=uid;
		map = new HashMap<String, Product>();
	}//Order
	
	public boolean addProduct(Product p){
		if(map.containsKey(p.getName())){
			Product p1 = map.get(p.getName());
			p1.setPrice(p1.getPrice()+p.getPrice());
			p1.setQuantity(p1.getQuantity()+p.getQuantity());
			return true;	
		}
		map.put(p.getName(),p);
		return false;
	}//addProduct
	
	public boolean removeProduct(String name) 
    throws ProductNotFoundException {
		if(map.containsKey(name)){
			map.remove(name);
			return true;
		}else throw new ProductNotFoundException(
      "Product with ID "+name+" is not Found.");
	}
	
	public Collection<Product> getCartDetails(){
		return map.values();
	}
	
	public Product getProductFromCart(String name) 
    throws ProductNotFoundException {
		if(map.containsKey(name)){
			return map.get(name);
		}else {
			throw new ProductNotFoundException(
        "Product with ID "+name+" is not Found.");
		}
	}
	
	public int productCount(){
		return map.size();
	}
  
  public double getCartPrice() {
    double price = 0.0d;
    Iterator<Product> iterator = getCartDetails().iterator();
    while(iterator.hasNext()){
      price+= iterator.next().getPrice();
    }
    return price;
  }
}
