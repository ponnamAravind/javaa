import java.util.*;
public class ATM 
{

	public static void main(String[] args) 
	{
		atm2 obj=new atm2();
		System.out.println("wellcome to atm");
		Scanner sc=new Scanner(System.in);
		System.out.println("choose option : pin \nbanking");
		String first=sc.next();
		if(first.equalsIgnoreCase("pin"))
		{
			System.out.println("choose option: greenpin \nchangepin");
			String second=sc.next();
			if(second.equalsIgnoreCase("greenpin"))
			{
				obj.pin();
			}
			else if(second.equalsIgnoreCase("changepin"))
			{
				obj.changePin();
			}
			else
			{
				System.out.println("invalide option");
			}
		}
		else if(first.equalsIgnoreCase("banking"))
		{
			 System.out.println("choose option : withdraw \ndeposit \nbalance");
			String three=sc.next();
			banking obj1=new banking();
			if(three.equalsIgnoreCase("withdraw"))
			{
				obj1.withdraw();
			}
			else if(three.equalsIgnoreCase("deposit"))
			{
				obj1.diposit();
			}
			else if (three.equalsIgnoreCase("balance"))
			{
				obj1.acbalance();
			}
			else
			{
				System.out.println("invalide option");
			}
		}
		else
		{
			System.out.println("invalide option");
		}
		System.out.println();
	}

}
class atm2
{
	Scanner sc=new Scanner(System.in);
	Random r=new Random();
	String moblie="9949444798";
	 void pin()
	 {
		 System.out.println("enter moblie number");
			String m=sc.next();
		 if(moblie.equals(m))
		 {
			 int otp=r.nextInt(1000,9999);
			 System.out.println("your atm otp: "+otp);
			 System.out.println("enter otp");
			 int reotp=sc.nextInt();
			 if(otp==reotp)
			 {
				 System.out.println("enter new pin");
				 int new1pin=sc.nextInt();
				 System.out.println("re-enter new otp");
				 int new2pin=sc.nextInt();
				 if(new1pin==new2pin)
				 {
					 System.out.println("pin sucessfully set");
				 }
				 else
				 {
					 System.out.println("pin not match");
				 }
			 }
			 else
			 {
				 System.out.println("otp is not match");
			 }
			 
		 }
		 else
		 {
			 System.out.println("invalide moblie number");
		 }
		
	 }
	 void changePin()
	 {
		 System.out.println("enter moblie number");
			String m=sc.next();
		 if(moblie.equals(m))
		 {
			 int otp=r.nextInt(1000,9999);
			 System.out.println("your atm otp: "+otp);
			 System.out.println("enter otp");
			 int reotp=sc.nextInt();
			 if(otp==reotp)
			 {
				 System.out.println("enter new pin");
				 int new1pin=sc.nextInt();
				 System.out.println("re-enter new otp");
				 int new2pin=sc.nextInt();
				 if(new1pin==new2pin)
				 {
					 System.out.println("pin sucessfully set");
				 }
				 else
				 {
					 System.out.println("pin not match");
				 }
			 }
			 else
			 {
				 System.out.println("otp is not match");
			 }
			 
		 }
		 else
		 {
			 System.out.println("invalide moblie number");
		 }
	 }
	 
}
class banking
{
	Scanner sc=new Scanner(System.in);
	double balance=10000;
	void withdraw()
	{
		
		System.out.println("enter withdraw amount");
		double amount=sc.nextDouble();
		if(balance>amount)
		{
		  System.out.println("your withdraw amount is:  "+amount+"\n a/c avalibale balance: "+(balance-amount));
		}
		else
		{
			throw new insufficentbalanceException("check your a/c balance");
		}
	}
	void diposit()
	{
		System.out.println("enter diposit amount");
		double amount=sc.nextDouble();
		System.out.println("your diposit balance: "+amount+" \nyour a/c balance:"+(amount+balance));
	}
	void acbalance()
	{
		System.out.println("your a/c balance: "+balance);
	}
}
class insufficentbalanceException extends RuntimeException
{
	insufficentbalanceException(String b)
	{
		super(b);
	}
}
