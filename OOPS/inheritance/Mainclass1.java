//SuperClass
class Sample extends Object
{
	public Sample()
	{
		super();//create an object of Superclass
		System.out.println("this is Sample() cosntructor");
	}
}

//SubClass
class Demo extends Sample
{
   public Demo()
	{
		super();//create an object of Superclass
		System.out.println("this is Demo() cosntructor");
	}  
}

class Mainclass1 extends Object
{
	public static void main(String[] args)
	{
		System.out.println("Program starts...");

      Demo d1 = new Demo();//Subclass

		System.out.println("Program ends...");
	}
}





