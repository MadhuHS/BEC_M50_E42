class Demo
{
	static int v1;//GV

	public static void test(double z1)//called
	{
		long k1 = 992199291821l;//lv
		System.out.println("this is test() of Demo class");
		System.out.println("v1 : "+v1);
		System.out.println("k1 : "+k1);
	}

	public void display()
	{
		System.out.println("this is display() of Demo class");
		System.out.println("v1 : "+v1);
	}
}

class Mainclass3
{
	public static void main(String[] args)//calling
	{
	   System.out.println("Program starts..");
       
       Demo.test(20);

       Demo d1 = new Demo();
       d1.display();

	   System.out.println("Program ends..");	
	}
}



