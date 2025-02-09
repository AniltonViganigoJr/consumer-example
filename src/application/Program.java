package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		List<Product> products = new ArrayList<>();
		
		products.add(new Product("Macbook Pro", 25000.0));
		products.add(new Product("iPhone 16", 16000.0));
		products.add(new Product("Notebook Lenovo", 5000.00));
		products.add(new Product("Airpods", 200.00));
		products.add(new Product("Smart TV LG 4K", 4850.00));
		products.add(new Product("External SSD 1Tb", 785.00));
		
		double factor = 1.1;
		
		products.forEach(p -> p.setPrice(p.getPrice() * factor));
		
		products.forEach(System.out::println);
	}
}