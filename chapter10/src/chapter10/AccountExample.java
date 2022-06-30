package chapter10;

public class AccountExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account=new Account();
		
		account.deposit(1000);
		System.out.println("예금액"+account.getBalance());
		
		try {
			account.withdraw(30000);
		}catch(BalanceInsufficientException e) {
			String message=e.getMessage();
			System.out.println(message);
			System.out.println();
			e.printStackTrace();
		}
	}

}
