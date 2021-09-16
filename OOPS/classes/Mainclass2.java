class User
{
   int uid = 123;
   String name = "Dinga";
   String dob = "13-Sep-1996";
   String email = "Dinga@manga.com";
   String pwd = "d123";
   long mob = 9876543210l;
   char gender = 'M';

   static String country = "India";

   public static void showUserCountry()//called
   {
   	 System.out.println("User Country is "+country);
   }

   public void showUserContact()//called
   {
   	 System.out.println("Mobile Number : "+mob);
   	 System.out.println("Email         : "+email);
   }

   public void updateUserEmail(String newEmail)
   {
      email = newEmail;//reintilize
   } 

   public void showUserDetails()//called
   {
   	 System.out.println("User Name : "+name);
   	 System.out.println("DOB       : "+dob);
   	 showUserContact();
   	 System.out.println("Gender    : "+gender);
   	 System.out.println("Country   : "+country);
   }
}

class Mainclass2
{
	public static void main(String[] args)//calling
	{
	   System.out.println("Program starts...");
       
       User us1;//laptop
       us1 = new User();
       
       User us2;//mobile
       us2 = us1;

       User us3 = new User();


       System.out.println("us1 : "+us1);
       System.out.println("us2 : "+us2);
       System.out.println("us3 : "+us3);

       us1.showUserContact();
       us1.updateUserEmail("dinga@gmail.com");
       us1.showUserContact();

       us2.updateUserEmail("dinag@yahoo.com");

       us1.showUserContact();

       us3.showUserContact();


	   System.out.println("Program ends...");	
	}
}










