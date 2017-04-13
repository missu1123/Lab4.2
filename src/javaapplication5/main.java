/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

public class main {
    public static void main(String[] args) { 
    	Product product = new Product("Edam", 3.3, 120);
        product.changePrice(3.5);
    	System.out.println("New product value is " + product.countValue());
    	product.printProduct();
       
     }

}
class Product {
	private String name;
	private double price;
	private int amount; //Amount in storage
        private double newprice;
      

	public Product(String name, double price, int amount) {
		this.name = name;
		this.price = price;
		this.amount = amount;
                
	}
        public double changePrice(double newprice) {
                this.price = newprice;
                return price;
         }

        public double countValue() {
		return(amount * price);
	}
 
	public void printProduct() {
		System.out.printf("Product %s, price %4.1f and balance %d pcs \t", name,price,amount);
	}        
}
