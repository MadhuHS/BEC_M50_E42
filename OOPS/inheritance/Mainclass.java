//SuperClass
class Sample
{
	final int v1 = 190;

	public void display()
	{
		System.out.println("this is display() of Sample class");
	}
}

//SubClass
class Demo extends Sample
{
   double z1 = 9.113;

   public void view()
   {
   	  System.out.println("this is view() of Demo class");
   }
}

class Mainclass
{
	public static void main(String[] args)
	{
		System.out.println("Program starts...");

		Sample s1 = new Sample();//Superclass

		System.out.println(s1.v1);//Superclass-DM
		s1.display();//Superclass-FM

		Demo d1 = new Demo();//Subclass
		
		System.out.println(d1.z1);//Subclass-DM
		d1.view();//Subclass-FM
		System.out.println(d1.v1);//Superclass-DM
		d1.display();//Superclass-FM

		System.out.println("Program ends...");
	}
}





