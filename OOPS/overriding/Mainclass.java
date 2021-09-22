//SuperClass
class Sample
{
	public void count(int num)
	{
		System.out.println("this is count() of Sample class");

      int a1 = 1;
		for(int count = 1; count <= num; count++)
		{
			System.out.println(a1++);
		}
	}
}

//SubClass
class Demo extends Sample
{
   @Override
   public void count(int num)
	{
		System.out.println("this is Overriden count() of Sample class");

      int a1 = num;
		for(int count = num; count >= 1; count--)
		{
			System.out.println(a1--);
		}
	}
}

class Mainclass
{
	public static void main(String[] args)
	{
		System.out.println("Program starts...");

		Sample s1 = new Sample();//Superclass
		s1.count(4);//Superclass-FM

		Demo d1 = new Demo();//Subclass
		d1.count(4);//Subclass-FM
		
		System.out.println("Program ends...");
	}
}





