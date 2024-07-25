package p1;

public class CreateAccount 
{
	public Account ac;//Instance Variable
	public CreateAccount(Account ac)
	{
		this.ac = ac;
	}
	public void create(long accNo,String cName,float bal,String accType)
	{
		ac.accNo = accNo;
		ac.cName = cName;
		ac.bal = bal;
		ac.accType = accType;
	}
	

}
