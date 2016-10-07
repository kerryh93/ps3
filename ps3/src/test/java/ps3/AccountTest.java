package ps3;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import ps3.Account;


public class AccountTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	



	@Test(expected=InsufficientFundsException.class)
	public final void testWithdraw() throws InsufficientFundsException {
		Account testAccount = new Account();
		
		testAccount.setId(5);			//test set id method
		testAccount.setBalance(500);	//test set balance method
	
		testAccount.withdraw(600);
	}




	@Test
	public void testAccount() throws InsufficientFundsException {
		int idNumber = 1122;
		double balance = 20000;
		double withdraw = 2500;
		double deposit = 3000;
		double AnnualInterest = 4.5;
		Account testAccount = new Account(idNumber, balance);
		testAccount.setAnnualInterestRate(AnnualInterest);
		assertEquals(testAccount.getAnnualInterestRate(), AnnualInterest,.001);
	
		assertEquals(testAccount.getId(), idNumber, 0);
		
		double TakeMoneyAway = balance - withdraw;
		testAccount.withdraw(withdraw);
		assertEquals(testAccount.getBalance(), TakeMoneyAway, .001);
		
		double moneyInTheBank = balance - withdraw + deposit;
		testAccount.deposit(deposit);
		assertEquals(testAccount.getBalance(), moneyInTheBank, .001);
		
		System.out.println("Your Balance is: $" + testAccount.getBalance());
		System.out.println("Your Monthly Interest Rate is: " +testAccount.getMonthlyRate() +"%");
		System.out.println("Date Created is: " + testAccount.getDateCreated());

	}

}