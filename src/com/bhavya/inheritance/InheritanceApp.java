package com.bhavya.inheritance;


class Product {
	
	int pid;
	String name;
	int price;
	
	
	Product() {
		System.out.println("Product Object Constructed");
	}
	
	void setProductDetais(int pid, String name, int price) {
		
		this.pid=pid;
		this.name=name;
		this.price=price;
	}
	
	void showProductDetails() {
		
		System.out.println("----------- Product ID: "+pid+"-------------");
		System.out.println("Name\t : "+name);
		System.out.println("Price \t: "+price);
		System.out.println("--------------------------------------------");
	}
}

class Mobile extends Product {
	
	String os;
	int ram;
	int sdCardSize;
	
	Mobile() {
		System.out.println("Mobile object Constructed");
	}
	
	void setProductDetais(int pid, String name, int price, String os, int ram, int sdCardSize) {
		
		this.pid=pid;
		this.name=name;
		this.price=price;
		this.os=os;
		this.ram=ram;
		this.sdCardSize=sdCardSize;
		
	}
	
void showProductDetails() {
		
		System.out.println("----------- Product ID: "+pid+"-------------");
		System.out.println("Name\t : "+name);
		System.out.println("Price \t: "+price);
		System.out.println("OS \t:" +os);
		System.out.println("Ram\t:"+ram);
		System.out.println("SdCardSize\t:"+sdCardSize);
		System.out.println("--------------------------------------------");
	}


}


public class InheritanceApp {

	public static void main(String[] args) {
		
		/*oduct product=new Product();
		System.out.println("Product is :"+product);
		
		product.setProductDetais(101, "iphone", 70000);
		product.showProductDetails();
		
		Product product1=new Product();
		product1.pid=102;
		product1.name="Shoes";
		product1.price=3000;
		
		product1.showProductDetails();*/
		
		
		Mobile mobile=new Mobile();
		mobile.setProductDetais(101,"Shirt",1500,"iOS",26,53);
		mobile.showProductDetails();
		

	}

}
