package entitites;

import java.util.ArrayList;
import java.util.List;

public class Product {
	protected String name;
	protected Double price;
	
	public Product() {
	}
	
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}
	
	private List<Product> products = new ArrayList<>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public void add(Product product) {
		products.add(product);
		
	}
	
	public Product getProducts(int i) {
		return products.get(i);
	}
	
	public int getLenghtOfProduct() {
		return products.size();
	}
	
	
	
	

}
