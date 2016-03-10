package base;
public class InsufficientFundsException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double amt;
	public InsufficientFundsException(double amt){
		super("Insufficient funds for withdrawal of $"+amt);
		this.amt = amt;
	}
	public double getAmt(){
		return amt;
	}
}