interface Run3
{
	public void test();//abstract-method
   
   public static void display()//static-method
	{
		System.out.println("this is static-display() of Run3 interface");
	}

	public default void count()//Non-static-method
	{
		System.out.println("this is default-count() of Run3 interface");
	}
}

class Demo implements Run3
{
   @Override
   public void test()
   {
   	System.out.println("Overriding test()");
   }
}

class Mainclass4
{
	public static void main(String[] args)
	{
		System.out.println("Program starts...");
	   
	   Run3.display();//static-method

	   Demo d1 = new Demo();
	   d1.count();

		System.out.println("Program ends...");
	}
}


