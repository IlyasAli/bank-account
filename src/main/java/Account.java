import java.math.BigDecimal;

public abstract class Account {
	
	String clientName;
	String accountNumber;
	BigDecimal accountBalance;
	BigDecimal intrestRate;

public Account(String clientName, String accountNumber, BigDecimal accountBalance, BigDecimal intrestRate) {
		super();
		this.clientName = clientName;
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
		this.intrestRate = intrestRate;
	}


public abstract void getAccountType();

public abstract void update();

}
