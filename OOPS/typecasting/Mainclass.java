class Mainclass
{
	public static void main(String[] args)
	{
	   System.out.println("Program starts..");

	   int    i1 = 24;
	   double d1 = i1;//widening

	   System.out.println("i1 : "+i1);
	   System.out.println("d1 : "+d1);

	   double d2 = 4.56;
	   int    i2 = (int)d2;//Narrowing
	                      //(datatype)value/var : casting stmt

       System.out.println("d2 : "+d2);
	   System.out.println("i2 : "+i2);
	   
	   System.out.println("Program ends..");	
	}
}