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
  boolean loginSuccess = false;

   public void signup(String name,long mob,String email,String pwd)
   {
     //Generate random integer for UID
     int uid = r1.nextInt(10000);//inBuilt-method
     
     //create DTO
     userDto = new User(uid,name,mob,email,pwd);
     
     //To-Do : save DTO data to DB
     System.out.println();
   }

   public void login(String entEmail,String entPwd)
   {
      //check signup was sucessfull
      if(userDto != null)
      {
         //Get Email and Pwd from DB
         if((entEmail.equals(userDto.email) && entPwd.equals(userDto.pwd)))
         {
            loginSuccess = true;
         }
         else
         {
            loginSuccess = false;
            System.out.println("ERROR : INVALID USERNAME OR PASSWORD!!");
         }
      }
      else
      {
         System.out.println("PLEASE COMPLETE SIGNUP");
      }
   }

   public void viewProfile()
   {
     if(loginSuccess == true)
     {
       System.out.println("Name   : "+userDto.name);
       System.out.println("Mobile : "+userDto.mob);
       System.out.println("Email  : "+userDto.email);
       System.out.println("UID   : "+userDto.uid);
       loginSuccess = false;
     }
     else
     {
       System.out.println("PLEASE LOGIN FIRST!!");
     }
   }
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