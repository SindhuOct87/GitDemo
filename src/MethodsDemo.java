
public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodsDemo m = new MethodsDemo();
		
		 String name= m.getData();
		 
		 System.out.println(name);
		 
		 System.out.println("*****************************");
		 
		 // To access method in another class, first create an object of that class
		 
		 MethodsDemo2 m2 = new MethodsDemo2();
		 
		  String name2= m2.getName();
		  
		  System.out.println(name2);
		  
		  System.out.println("*****************************");
		  
		  String name3 = getData2();
		  
		  	
	}
	
	//methods cannot be declared inside main block. Execution will be done inside main block
	
	
	
	public  String getData()
	{
		System.out.println("Hekko Sindhu");
		return "Sindhu A S";
	}
	
	//If we change the method to static, then the method belongs to the class itsel fand not to object, so we do not need to create an object to access the method
	
	public  static String getData2()
	{
		System.out.println("Hello Sindhu");
		return "Sindhu";
	}


}
