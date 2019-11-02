import java.util.Random;

public class BankAccount {

	private String account_num;
	private double check_balance;
	private double save_balance;
	private static int account_counter;
	private static double stored_money;
	
	public BankAccount() {
		
		account_counter++;
	}
	private String randomAccountID() {
		
		long x = (long) Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L;
		
		return Long.toString(x);
	}
	
	
	public double getCheckBalance() {
		return check_balance;
	}
	
	public double getSaveBalance() {
		return save_balance;
	}
	
	public void manage_account(double deposit_check,double deposit_save) {
		this.check_balance += deposit_check;
		this.save_balance += deposit_save;
		stored_money += deposit_check;
		stored_money += deposit_save;
	}
	
	public void withdroe_checkBalance(double withdrow_check) {
		if(this.check_balance - withdrow_check >= 0) {
		this.check_balance -= withdrow_check;
		stored_money -= withdrow_check;
		}
	}
	
	public void withdroe_saveBalance(double withdrow_save) {
		if(this.check_balance - withdrow_save >= 0) {
		this.check_balance -= withdrow_save;
		stored_money -= withdrow_save;
		}
	}
	
	public double total_amount() {
		return this.check_balance +this.save_balance;
	}
	
}
