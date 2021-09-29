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

class Mainclass4
{
   public static void test(Sample ref)//Superclass-ref
   {
     System.out.println("this is test()");
     
     ref.display();//Superclass-Method

     if(ref instanceof Demo) //identify the subclass-object
     {
        Demo ref2 = (Demo) ref;//Downcasting
        ref2.view();//Demo-Subclass-Method
     }
     else
     {
        Counter ref3 = (Counter) ref;//Downcasting
        ref3.show();//Counter-Subclass-Method
     }
     
   }

	public static void main(String[] args)
	{
		System.out.println("Program starts...");
      
      Demo d1 = new Demo();//Object of Subclass
      Counter c1 = new Counter();//Object of Subclass
     
      test(c1);//pass Object reference of Subclass
      test(d1);//pass Object reference of Subclass
      

		System.out.println("Program ends...");
	}
}









