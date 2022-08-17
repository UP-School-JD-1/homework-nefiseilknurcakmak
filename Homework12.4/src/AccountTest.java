
public class AccountTest {

	public static void main(String[] args) {
		AccountClient accountClient = new AccountClient();
		Account myAccount = new Account();
		Account otherAccount = new Account();

		accountClient.DrawMoney(myAccount, 4);
		accountClient.DrawMoney(myAccount, 10);
		accountClient.DrawMoney(myAccount, 9);
		accountClient.InvesteMoney(myAccount, 35);
		accountClient.transfer(myAccount, otherAccount, 10);
		accountClient.transfer(myAccount, otherAccount, 5);
	}
}
