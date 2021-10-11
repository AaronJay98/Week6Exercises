package Exercise1;

import java.util.ArrayList;
import java.util.List;

final class Account {
	private long id;
	private String accountType;
	
	public Account(long id, String accountType) {
		this.id = id;
		this.accountType = accountType;
	}

	public long getId() {
		return id;
	}
	public String getAccountType() {
		return accountType;
	}

	public void setId(long id) {
		this.id = id;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	public static List createAccounts(int numAccounts) {
		List<Account> returnAccounts = new ArrayList<Account>();
		Account newAccount;
		
		for(int i = 1; i <= numAccounts; i++) {
			newAccount = new Account(i, "checking");
			returnAccounts.add(newAccount);
		}
		return returnAccounts;
	}
}
