package Exercise1;

import java.util.List;

public class Application {

	public static void main(String[] args) {
		int numAccounts = 5;
		List<Account> accountList = Account.createAccounts(numAccounts);
		
		for(int i = 0; i < numAccounts; i++) {
			System.out.println(accountList.get(i).getId());
		}
	}
}
