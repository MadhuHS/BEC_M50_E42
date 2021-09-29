import java.util.Random;

interface AppUser
{

}

//Entity
class Admin implements AppUser
{
   int empId;
   String name;
   String email;
   String pwd;
   int deptId;

   public Admin()
   {

   }
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
class Customer implements AppUser
{
   int cusId;
   String name;
   String email;
   String pwd;
   long mob;
   String address;

   public Customer()
   {

   }

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

interface AppSecurity
{
   public void login(AppUser ref);

   public void signup(AppUser a1);

   public default void logout()
   {
       System.out.println("this is logout() of UserService");
   } 
}

class AppSecurityImpl implements AppSecurity
{
   AppUser adminDto;
   boolean loginSuccess;

   @Override
   public void login(AppUser ref)
   {
      System.out.println("Login done...");
   }

   @Override
   public void signup(AppUser a1)
   {
       System.out.println("Sign up done...");
   }
}



//Front-END
class Mainclass
{
	public static void main(String[] args)
	{
	  System.out.println("Program starts...");

     AppSecurityImpl asec = new AppSecurityImpl();

     Admin a1 = new Admin();
     Customer c1 = new Customer();

     asec.signup(a1);
     asec.signup(c1);
     
     asec.login(a1);
     asec.login(c1);

	  System.out.println("Program ends...");
	}
}






