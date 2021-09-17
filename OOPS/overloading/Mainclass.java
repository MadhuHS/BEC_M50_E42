class Graph
{
  public void drawPoint()
  {
    System.out.println("draw point at 0,0");
  } 

  protected void drawPoint(int x,int y)
  {
    System.out.println("draw point at "+x+","+y);
  } 

  public static void drawPoint(double x,double y)
  {
    System.out.println("draw point at "+x+","+y);
  } 

  public int drawPoint(int x,double y)
  {
    System.out.println("draw point at "+x+","+y);
    return 10;
  }

  public void drawPoint(double x,int y)
  {
    System.out.println("draw point at "+x+","+y);
  }

  public void drawPoint(double x,int y,double z)
  {
    System.out.println("draw point at "+x+","+y+","+z);
  }  
}

class Mainclass
{
	public static void main(String[] args)
	{
	   System.out.println("Program starts...");
       
       Graph g1 = new Graph();

       g1.drawPoint();
       g1.drawPoint(2,3);
       g1.drawPoint(2.5,3.1);
       g1.drawPoint(8,1.3);
       g1.drawPoint(3.1,2);
       g1.drawPoint(3.1,2,9.1);

       System.out.println();
       System.out.println(10);
      

	   System.out.println("Program ends...");
	}
}



