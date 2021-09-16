class Sample
{
   static int v1 = 813;//GV
   long p1 = 9099087771721l;//GV

   public static void test()
   {
   	 double v1 = 901.31;//LV

   	 System.out.println("this is test() of Sample class");
   	 
   	 System.out.println("v1 : "+v1);//LV

     System.out.println("v1 : "+Sample.v1);//GV
   }

   public void display()
   {
   	 String p1 = "jspiders";//LV

   	 System.out.println("this is display() of Sample class");
   	 
   	 System.out.println("p1 : "+p1);//LV

   	 System.out.println("p1 : "+this.p1);//LV
   }
}

class Mainclass4
{
	public static void main(String[] args)
	{
	   System.out.println("Program starts...");

	   Sample.test();

	   Sample s1 = new Sample();
	   s1.display();

	   System.out.println("Program ends...");	
	}
}






