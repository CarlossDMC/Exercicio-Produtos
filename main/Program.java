package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entitites.ImportedProduct;
import entitites.Product;
import entitites.UsedProduct;

public class Program {
	
	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		Product products = new Product();

		
		System.out.println("Enter the number of products: ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			
			System.out.println("Common, used or imported (c/u/i)? ");
			String type = sc.next().toLowerCase();
			
			if(type.equals("c")) {
				
				System.out.println("Product #" + (i + 1) + " data: ");
				
				System.out.println("Name: ");
				String name = sc.next();
				
				System.out.println("Price: ");
				Double price = sc.nextDouble();
				
				Product product = new Product(name, price);
				
				products.add(product);
			}
			
			if(type.equals("i")) {
				
				System.out.println("Product #" + (i + 1) + " data: ");
				
				System.out.println("Name: ");
				String name = sc.next();
				
				System.out.println("Price: ");
				Double price = sc.nextDouble();
				
				System.out.println("Fee: ");
				Double fee = sc.nextDouble();
				
				Product product = new ImportedProduct(name, price, fee);
				
				products.add(product);
			}
			
			if(type.equals("u")) {
				
				System.out.println("Product #" + (i + 1) + " data: ");
				
				System.out.println("Name: ");
				String name = sc.next();
				
				System.out.println("Price: ");
				Double price = sc.nextDouble();
				
				System.out.println("Manufactured Date (DD/MM/YY): ");
				String date_ = sc.next();
				Date date = new SimpleDateFormat("dd/MM/yyyy").parse(date_);
				
				Product product = new UsedProduct(name, price, date);
				
				products.add(product);
			}
			
		}
		
		System.out.println("PRICE TAGS:");
		for(int i=0; i<products.getLenghtOfProduct(); i++) {
			
			
			
			if(products.getProducts(i).getClass().getSimpleName().equals("Product")) {
			System.out.println(products.getProducts(i).getName() + " $ " + products.getProducts(i).getPrice());
			}
			
			if(products.getProducts(i).getClass().getSimpleName().equals("ImportedProduct")) {
			System.out.println(products.getProducts(i).getName() + " $ " + products.getProducts(i).getPrice() + " Customs fee: (" + ((ImportedProduct) products.getProducts(i)).getCustomsFee() + ")");
			}
			
			if(products.getProducts(i).getClass().getSimpleName().equals("UsedProduct")) {
				System.out.println(products.getProducts(i).getName() + " $ " + products.getProducts(i).getPrice() + " Manufacture date: (" + ((UsedProduct) products.getProducts(i)).getManufactureDate() + ")");
				}
			
			
	
			
		}
		
		
		
		sc.close();
		
		
	}

}
