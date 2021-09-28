interface Run
{
	public int getUnicode(char c1);
	public char getChar(int unicode);
	public int add(double n1,double n2);
}

class Demo implements Run
{
	@Override
	public int getUnicode(char c1)
	{
		/*
		double n3 = n1 + n2;
		int n4 = (int)n3;
		return n4;

		int n3 = (int) (n1 + n2);
		return n3;
		*/
        return c1;
	}

	@Override
	public char getChar(int unicode)
	{
		/*char ch1 = (char)unicode;//Narrowing
        return ch1;*/

        return (char)unicode;
	}
    
    @Override
	public int add(double n1,double n2)
	{    
        System.out.println("this is add(double n1,double n2)");
        return (int) (n1 + n2);	
	}

	/*public int add(int n1,int n2)
	{
	   System.out.println("this is add(int n1,int n2)");
       return n1+n2;
	}*/
}

class Mainclass2
{
	public static void main(String[] args)
	{
	   System.out.println("Program starts..");

	   Demo d1 = new Demo();
	   
	   int res = d1.getUnicode('A');
	   System.out.println("res : "+res);

	   char res2 = d1.getChar(77);
	   System.out.println("res2 : "+res2);

	   int res4 = d1.add(5,3);
	   System.out.println("res4 : "+res4);
	   
	   System.out.println("Program ends..");	
	}
}

