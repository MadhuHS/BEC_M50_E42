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

//SubClass
class Counter extends Sample
{
   String str = "jspiders";

   public void show()
   {
   	  System.out.println("this is show() of Cou class");
   }
}

class Mainclass3
{
	public static void main(String[] args)
	{
		System.out.println("Program starts...");

      Demo   d1 = new Demo();//create Object of Subclass
      Sample s1 = d1;//Upcasting

      s1.display();//Superclass-method
      System.out.println(s1.v1);//Superclass-DM

      Demo d2 = (Demo) s1;//downcasting

      d2.display();//Superclass-method
      System.out.println(d2.v1);//Superclass-DM

      d2.view();//Subclass-method
      System.out.println(d2.z1);//Subclass-DM


     
		System.out.println("Program ends...");
	}
}





