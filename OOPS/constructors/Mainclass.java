class Demo
{
	//Constructor
	public Demo()
	{
      System.out.println("Executing Constructor of Demo class");
	} 
    
    //Method
	public void test(int v1)
	{
      System.out.println("this is test() of Demo class");
	}
}

class Mainclass
{
	public static void main(String[] args)
	{
	  System.out.println("Program starts...");
      
      Demo d1 = new Demo();//new ConstructorCall
      d1.test(10);//methodCall

	  System.out.println("Program ends...");	
	}
}




