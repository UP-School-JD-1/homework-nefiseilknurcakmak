
public class AccountClient {

	public void DrawMoney(Account account, double amount) {

		if (amount > account.getBalance()) {
			System.out.println("Account balance is not enough to draw.");

			return;
		}
		System.out.println(amount + "TL has been drawn");
	}

	public void InvesteMoney(Account account, double amount) {
		System.out.println(amount + "TL has been invested");
		return;
	}

	public void transfer(Account myAccount, Account otherAccount, double amount) {
		if (myAccount.getBalance() < (amount)) {
			System.out.println("Account balance is not enough to transform.");
			return;
		}
		System.out.println(amount + "TL  has been tranformed");

	}

}
