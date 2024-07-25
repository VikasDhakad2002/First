package p2;
import java.util.Scanner;
import p1.*;

public class DemoRef3 {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		Account ac = new Account();
		CreateAccount ca = new CreateAccount(ac);
		DisplayAccount da = new DisplayAccount(ac);
		System.out.println("Enter the AccNo:");
		long accNo = Long.parseLong(s.nextLine());
		System.out.println("Enter the CustName:");
		String cName = s.nextLine();
		System.out.println("Enter the Balance:");
		float bal = Float.parseFloat(s.nextLine());
		System.out.println("Enter the AccType:");
		String accType = s.nextLine();
		ca.create(accNo, cName, bal, accType);
		da.dis();
		s.close();

	}

}
