package object;

public class BankAccount {
	
	String name;
	int AccountBal;
	
	public void deposite(int d) {
		AccountBal+=d;
	}
	
	public void withdraw(int w) {
		if(AccountBal<w) {
			System.out.println("Insufficient Balance....");
		}else {
			AccountBal-=w;
			System.out.println("withdraw Successfull....");
		}
	}
	public void checkBal() {
		System.out.println("AccountBal : "+AccountBal);
	}
	
	public static void main(String[] args) {
		BankAccount b=new BankAccount();
		b.name="Mathivanan";
		b.AccountBal=0;
		
		
		b.checkBal();
		b.deposite(5000);
		b.withdraw(5100);
		b.withdraw(3000);
		b.checkBal();
	}
}
