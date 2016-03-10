package base;
import java.util.Date;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Account_Test {
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	private Date Date;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	/*@Test
	public void test() {
		assertTrue(1==1);
	}*/
	@Test
	public void testWithdraw() throws InsufficientFundsException{
		Account A = new Account(20000,1122);
		A.setAnnualInterestRate(4.5);
		A.getDate();	
		double bActualAmount = A.withdraw(2500.0);
		double bExpectedAmount = 17500.0;
		assertEquals((long)bActualAmount,(long)bExpectedAmount);
	}
	@Test
	public void testDeposit(){
		Account B = new Account(20000,1122);
		B.setAnnualInterestRate(4.5);
		B.getDate();
		double bActualAmount = B.deposit(3000.0);
		double bExpectedAmount = 23000.0;
		assertEquals((long)bActualAmount,(long)bExpectedAmount);
	}
	@Test(expected=InsufficientFundsException.class)
	public final void testWithdraw2() throws InsufficientFundsException {
		Account C = new Account(0,101);
		C.deposit(500.00);
		assertEquals((long)C.getBalance(),(long)500.00);
        C.withdraw(900);
	}
}
