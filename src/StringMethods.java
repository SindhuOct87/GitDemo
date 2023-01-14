
public class StringMethods {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		
		// To split the names in a string
		
		String s = new String("Sindhu Ananthapadmanabhan Sridharan");
		
		//create an array to store the 3 values after split method
		
		String[] namesplit = s.split(" ");
		
		for (int i=0; i<namesplit.length; i++)
		{
		 
			System.out.println(namesplit[i]);
		}
		
		System.out.println("*****************************");
		
		// To trim the string
		
		System.out.println(namesplit[1].trim());
		
		System.out.println("*****************************");
		
		for (int i =0; i< s.length(); i++)
		{
			System.out.println(s.charAt(i));
	    }

}
}
