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
   	  System.out.println("this is show() of Count class");
   }
}

class Mainclass5
{
  
   public static Sample getObject(String className)
   {
      
      if(className.equals("Sample"))
      {
         return new Sample();//Create an Object and return ref.
      } 
      else if(className.equals("Demo"))
      {
          return new Demo();//Create an Object and return ref.
      }
      else
      {
         return new Counter();//Create an Object and return ref.
      }  
   }

	public static void main(String[] args)
	{
		System.out.println("Program starts...");
      
      Sample s1 = getObject("Sample");//utilize the Sample object
      s1.display();

      Demo d1 = (Demo)getObject("Demo");//utilize the Demo object
      d1.view();

      Counter c1 = (Counter) getObject("Counter");//utilize the Couter object
      c1.show();

		System.out.println("Program ends...");
	}
}









