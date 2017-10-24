package string;

public class StringDemo {

	
		public static void main(String[] args)
		//static is used for memory management
		//void is used to define the return type of the method
		//String[] args is actually an array of java.lang.String type and it's name is args here
			{
			// TODO Auto-generated method stub
			int integer=500;//Initializing the integer value
			String string=String.valueOf(integer);
	//creating a String object. 
	//valueOf(integer):means it is static method Of string class.
	//It is a returns the value of integer that we gave
	//It convert int into String in java
			string=Integer.toString(integer);
		//It is a returns the value of integer that we gave
		//It convert int into String in java
			System.out.println("After converting int into string");
	
				System.out.println("Output is:"+integer);
				//prints the integer
		}
	}
