package oop1;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Vade orani";

		Product product1 = new Product();
	product1.setName("Delonghi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice (7500);
		product1.setUnitsInStock(3);
		product1.setImageUrl("xxx.jpg");
		
		Product product2 = new Product();
		product2.setName("Smeg Kahve Makinesi");
		product2.setDiscount(7);
		product2.setUnitPrice (7500);
		product2.setUnitsInStock(3);
		product2.setImageUrl("xxx.jpg");

		Product product3 = new Product();
		product3.setName("Kitchen Aid");
		product1.setDiscount(7);
		product1.setUnitPrice (7500);
		product1.setUnitsInStock(3);
		product1.setImageUrl("xxx.jpg");
		
		
		Product [] products = {product1, product2, product3} ;
		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>"+product.getName() + "</li>");
			
		}
		System.out.println("</ul>");
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("052465987");
		individualCustomer.setCustomerNumber("5642");
		individualCustomer.setFirstName("aaa");
		individualCustomer.setLastName("fgtz");
		
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("ffff");
		corporateCustomer.setPhone("25648");
		corporateCustomer.setCustomerNumber("888");
		corporateCustomer.setTaxNumber("111");
		
		Customer [] customers = {individualCustomer, corporateCustomer} ;
		
		
		
		
	}

}
