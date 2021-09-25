//Super-Most-Interface
interface Run1
{
   static final int z1 = 920;//static-dm
   public void test();
}

//Sub-Interface // Super-Interface
interface Run2 extends Run1
{
	double p1 = 8392.42;
	public void display();
}

//Implementation class
class Demo implements Run2
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

class Mainclass2
{
	public static void main(String[] args)
	{
		System.out.println("Program starts...");
		Demo d1 = new Demo();
		d1.display();
		d1.test();
		System.out.println("Program ends...");
	}
}


