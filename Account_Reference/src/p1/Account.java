package p1;

public class Account 
{
	public long accNo;
	public String cName,accType;
	public float bal;
	public void getAccount()
	{
		System.out.println("****AccountDetails****");
		System.out.println("AccNo:"+accNo);
		System.out.println("CustName:"+cName);
		System.out.println("Balance:"+bal);
		System.out.println("AccType:"+accType);
	}

}
