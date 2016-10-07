package ps3;
import java.util.Date;




public class Account
{
		
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date DateCreated;
	public Account() 
	{
		super();
	}
	public Account(int id, double balance) 
	{
		super();
		this.id = id;
		this.balance = balance;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	public Date getDateCreated() {
		return DateCreated;
	}
	public double getMonthlyRate ()
	{
		return  annualInterestRate/12;
	}
	public void withdraw ( double Amount ) throws InsufficientFundsException
	{
		if (Amount <= balance )
		{
			balance -= Amount;
		}
		else 
		{
			double needs = Amount - balance;
			throw new InsufficientFundsException(needs);
		}
	}
	
	public void deposit (double amount)
	{	
		balance += amount;
	}
}
		
	
	
	
	
		
		
		

