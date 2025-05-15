class Mobile{
	String brand;
	int price;
	String network;
	static String name;
	
	static {
		name="Phone";
		System.out.println("in static block");
	}
	
	public Mobile() {
		brand="";
		price=200;
//		name="Phone";
		System.out.println("in constructor");
	}
	
	public void show() {
		System.out.println(brand+" : "+price+" : "+name);
	}
	
	
}

public class Demo {
	public static void main(String[] args) throws ClassNotFoundException
	{
		
		Class.forName("Mobile");  //Class.forName() is a function in java used to load class in a class pooler present in jvm.
		//class pooler is present in jvm,after loading class the static {	} gets excetued, then objects are created (instantiated);
//		Mobile obj1=new Mobile();
//		obj1.brand="Apple";
//		obj1.price=1500;
//		Mobile.name="SmartPhone";
//		
//		Mobile obj2=new Mobile();

	
	}
}
