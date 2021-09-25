//Super-Interface
interface Run
{
   static final int z1 = 920;//static-dm

   public void test();
}

//Implementation Class
class Sample implements Run
{
   @Override
   public void test()
   {
   	 System.out.println("Overriding test() in Sample class");
   }
}

class Mainclass
{
	public static void main(String[] args)
	{
		System.out.println("Program starts...");
		Run r1;//interface Ref. var 
		//Run.z1 = 5261;
        System.out.println(Run.z1);
		System.out.println("Program ends...");
	}
}