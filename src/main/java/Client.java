
public class Client {

	public static void main(String[] args) {
		
		BankApp app = new BankApp();
		//app.setAcc(new SavingAccount());
		app.setAcc(new CurrentAccount());
		
		app.showDetails();

	}

}
