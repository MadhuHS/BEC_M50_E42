class Demo
{
	static int    x1 = 123;//static-dm
           double y1 = 2.45;//static-dm
    static final long   z1 = 987818201029l;//static-dm      

    public static void test()//static-fm
	{
		System.out.println("this is test() of Demo class");
	}
    public void display()//NON-static-fm
	{
		System.out.println("this is display() of Demo class");
	}
}

class Mainclass
{
	public static void main(String[] args)
	{
		System.out.println("Program starts...");

        System.out.println(Demo.x1);
		Demo.x1 = 972;//re-intilization
		System.out.println(Demo.x1);

		System.out.println(Demo.z1);

		Demo.test();
		new Demo().display();

		Demo.test();
		new Demo().display();

		System.out.println("Program ends...");
	}
}