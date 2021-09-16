import java.util.Random;//inbuilt class

//Entity - DTO
class User
{
  int uid;
  String name;
  long mob;
  String email;
  String pwd;


}

//Service - Biz Logics
class UserService
{
   User userDto;
   public void signup(String name,long mob,String email,String pwd)
   {
     
     //create DTO
     userDto = new User(1234,name,mob,email,pwd);
     
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