 

package object;

public class LaptopDriver {
	public static void main(String[] args) {
		Laptop laptop1=new Laptop();
		laptop1.brand="Lenevo";
		laptop1.price=54000;
		laptop1.processor="i5";
		laptop1.ram="16GB";
		
		System.out.println(laptop1.brand);
		System.out.println(laptop1.price);
		System.out.println(laptop1.processor);
		System.out.println(laptop1.ram);

	}

}
