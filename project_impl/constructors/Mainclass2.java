import java.util.Random;//inbuilt class

//Entity - DTO
class User
{
  int uid;
  String name;
  long mob;
  String email;
  String pwd;

  public User(int uid,String name,long mob,String email,String pwd)
  {
    this.uid   = uid;
    this.name  = name;
    this.mob   = mob;
    this.email = email;
    this.pwd   = pwd;
  }
}

//Service - Biz Logics
class UserService
{
   public void signup(String name,long mob,String email,String pwd)
   {
     //Generate random integer for UID
     int uid = r1.nextInt(10000);//inBuilt-method
     
     //create DTO
     userDto = new User(uid,name,mob,email,pwd);
     
     //To-Do : save DTO data to DB
     System.out.println();
   }

   public void viewProfile()
   {
     
   }
}

//Front-End
class Mainclass
{
	public static void main(String[] args)
	{
	   System.out.println("Program starts..");
       
    
	   System.out.println("Program ends..");	
	}
}