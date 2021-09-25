import java.util.Random;
//Entity
class Admin
{
   int empId;
   String name;
   String email;
   String pwd;
   int deptId;

   public Admin(int empId,String name,
   	           String email,String pwd,int deptId)
   {
      this.empId = empId;
      this.name = name;
      this.email = email;
      this.pwd = pwd;
      this.deptId = deptId;
   }
}

//Entity
class Customer
{
   int cusId;
   String name;
   String email;
   String pwd;
   long mob;
   String address;

   public Customer(int cusId,String name,
   	           String email,String pwd,long mob,String address)
   {
      this.cusId = cusId;
      this.name = name;
      this.email = email;
      this.pwd = pwd;
      this.mob = mob;
      this.address = address;
   }
}


abstract class UserService
{
   abstract public void login(String entEmail,String entPwd);

   abstract public void signup();

   public void logout()
   {
   	 System.out.println("this is logout() of UserService");
   }
}

class AdminService extends UserService
{
   Admin adminDto;
   boolean loginSuccess;

   @Override
   public void login(String entEmail,String entPwd)
   {
      //check signup was sucessfull
      if(adminDto != null)
      {
         //Get Email and Pwd from DB
         if((entEmail.equals(adminDto.email) && entPwd.equals(adminDto.pwd)))
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

   @Override
   public void signup()
   {
   	 System.out.println("Overriding login() AdminService");
   }
}

class CustomerService extends UserService
{
   Customer customerDto;
   boolean loginSuccess;

   @Override
   public void login(String entEmail,String entPwd)
   {
      //check signup was sucessfull
      if(customerDto != null)
      {
         //Get Email and Pwd from Db from CUSTOMER
         if((entEmail.equals(customerDto.email) && entPwd.equals(customerDto.pwd)))
         {
            int otp = OtpUtil.generateOTP();

            if(OtpUtil.verifyOTP(otp) == true)
            {
                loginSuccess = true;
            }
            else
            {
               System.out.println("ERROR : INVALID OTP!!");
            }
           
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

   @Override
   public void signup()
   {
   	 System.out.println("Overriding login() CustomerService");
   }	
}

//Utility
class OtpUtil
{
   static int otp;

   public static int generateOTP()
   {
      otp = new Random().nextInt(5000);
      return otp;
   }

   public static boolean verifyOTP(int entOtp)
   {
      if(entOtp == otp)
      {
         return true;//OTP matching
      }
      else
      {
         return false;//OTP not matching
      }
   }
}
class Mainclass
{
	public static void main(String[] args)
	{
	  System.out.println("Program starts...");

	  System.out.println("Program ends...");
	}
}