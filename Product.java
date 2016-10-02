package wineshop.orders;

public class Product implements java.io.Serializable {
	
	public String name;
	public String description;
	public int quantity;
	public double price;

	public Product(){}
	public Product(String name, String description, int quantity, double price) {
		this.name = name;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
	}
	
	public void setPid(String name) {
		this.name = name; 
	}

	public void setPname(String description) {
		this.description = description; 
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity; 
	}

	public void setPrice(double price) {
		this.price = price; 
	}

	public String getName() {
		return (this.name); 
	}

	public String getDescription() {
		return (this.description); 
	}

	public int getQuantity() {
		return (this.quantity); 
	}

	public double getPrice() {
		return (this.price); 
	}

	public String toString() {
		String sep = System.getProperty("line.separator");
		StringBuffer buffer = new StringBuffer();
		buffer.append(sep);
		buffer.append("----- Product Detail ----- ");
		buffer.append(sep);
    buffer.append("\tWine = ");
		buffer.append(name);
		buffer.append(sep);
		buffer.append("\tDescription = ");
		buffer.append(description);
		buffer.append(sep);
		buffer.append("\tQuantity = ");
		buffer.append(quantity);
		buffer.append(sep);
		buffer.append("\tPrice = ");
		buffer.append(price);
		buffer.append(sep);
		return buffer.toString();
	}//toString

}//class
