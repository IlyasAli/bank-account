import java.math.BigDecimal;

public class CheckingAccount extends Account {

	public CheckingAccount(String clientName, String accountNumber, BigDecimal accountBalance, BigDecimal intrestRate) {
		super(clientName, accountNumber, accountBalance, intrestRate);
	}

	@Override
	public void getAccountType() {
		
	}

	@Override
	public void update() {
		
	}

}
