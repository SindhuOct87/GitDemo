import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// DATA TYPES IN JAVA
		int MyNum = 5;
		
		java.lang.String name = "Sindhu A S";
		
		double Number = 4.5;
		
		char Initial = 'A';
		
		double Number1 = 100.923567;
		
		boolean result = true;
		
		// In Java you cannot concatenate the variable and string together, we need a concatenate operator
		System.out.println(MyNum + " is the value which is printed");
		
		System.out.println("*****************************");
		
		//ARRAYS IN JAVA
		// Can store multiple values in a a single variable
		// Initialize the array variable, then allocate the memory and decide how many values it can hold/store
		int[] array = new int[5];
		// declare the values to the variable
		array[0] = 1;
		array[1] = 14;
		array[2] = 4;
		array[3]= 9;
		
		//another way
		int[] array2 = {1,2,3,4,5, 34,56,78,88,90,97,105};
		System.out.println(array2[2]);
		
		System.out.println("*****************************");
		
		// FOR LOOP IN JAVA
		//to print the values in the array we use for loop
		
		for (int i= 0; i<array.length; i++ )
		{
		System.out.println(array[i]);
		}
	
		for (int j=0; j<array2.length;j++)
		{
			System.out.println(array2[j]);
		}
		
		System.out.println("*****************************");
		
		//Array in String
		String[] name1 = {"Sindhu", "Ayyappan", "Pragya"};
		for (int k = 0; k<name1.length; k++)
		{
			System.out.println(name1[k]);
		}
		
		System.out.println("*****************************");
		
		// CONDITIONALS IF and ELSE STMTS
		
		for (int i = 0; i < array2.length; i++)
		{
			if (array2[i] % 2 ==0)
			{
				System.out.println(array2[i]);
			}
			else
			{
				System.out.println("These values are not multiple of 2"+ "- " +  array2[i]);
			}
		}
		
		System.out.println("*****************************");
	
		//ARRAY LISTS - STRING
		ArrayList<String> a = new ArrayList<String>();
		a.add("Sindhu");
		a.add("Pragya");
		a.add("Ayyappan");
		a.add("Thangam");
		a.add("Vedha");
		a.add("Sridharan A ");
		for (int i = 0; i < a.size(); i++ )
		{
		System.out.println(a.get(2));
		}
		
		System.out.println("*****************************");
		
		// ENHANCED FOR LOOP
		
		for (String val : a) 
		{
			System.out.println(val);
		}
		
		System.out.println("*****************************");
		
		// To check if the value is present in the arraylist
		
		System.out.println( a.contains("Pragya"));
		
		System.out.println("*****************************");
		
		// To convert Array to ArrayList. Use the class Arrays  and use method as asList
		
		  List<String> nameArrayList = Arrays.asList(name1);
		  
		  System.out.println(nameArrayList.contains("Sindhu"));	
		
		
	}
	
}


