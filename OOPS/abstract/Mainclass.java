//Superclass
abstract class Sample
{
	static int v1 = 912;//static-DM
	double z1 = 8.12;//Non-static-DM

	abstract public void test();

	public static void display()//static-FM
	{
		System.out.println("this is display() of Sample");
	}

	public void view()//Non-static-FM
	{
		System.out.println("this is view() of Sample");
	}
}

//Subclass
class Demo extends Sample
{
	@Override
    public void test()
    {
      System.out.println("Overriding test()");
    }
}

class Mainclass
{
	public static void main(String[] args)
	{
		System.out.println("Program starts..");

		Sample s1;//ref. var of Abstract class type

		System.out.println(Sample.v1);//abstract-Superclass-static-DM
        Sample.display();//abstract-Superclass-static-FM
        
        Demo d1 = new Demo();//Object of Subclass
        
        System.out.println(d1.z1);//abstract-Superclass-Non-static-DM
        d1.view();//abstract-Superclass-Non-static-FM


        d1.test();//Subclass-Overriden-method

		System.out.println("Program ends...");
	}
}




