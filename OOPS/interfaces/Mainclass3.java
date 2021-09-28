//Super-Interface
interface Run1
{
   static final int z1 = 920;//static-dm
   public void test();
}

// Super-Interface
interface Run2 
{
	double p1 = 8392.42;
	public void display();
	public void test();
}

//Implementation class
class Demo extends Object implements Run1,Run2
{
   @Override
   public void display()
   {
   	System.out.println("Overriding display() in Demo class");
   }

   @Override
   public void test()
   {
   	System.out.println("Overriding test() in Demo class");
   }
}

class Mainclass3
{
	public static void main(String[] args)
	{
		System.out.println("Program starts...");
		Demo d1 = new Demo();

		d1.test();
		d1.display();

		System.out.println("Program ends...");
	}
}


