package junior;

public class BankAccountApp {
	
	public static void main(String args[]){
		System.out.println("bank acccount");
		
		BankAccount acc1=new BankAccount("465329874",1000.50);
		BankAccount acc2=new BankAccount("654132987",2000);
		BankAccount acc3=new BankAccount("321569756",2500);
		acc1.setName("jim");
		System.out.println(acc1.getName());
		acc1.makeDeposit(500);
		acc1.makeDeposit(600);
		acc1.payBill(1000);
		System.out.println(acc1.toString());
	}
		
	}
	class BankAccount implements IInterest{
		private static int iD=1000;
		private String accountNumber;
		private static final  String routingNumber="005400657";
		private String name;
		private String SSN;
		private double balance;
		
		public BankAccount (String SSN, double initDeposit){
			balance=initDeposit;
			this.SSN=SSN;
			iD++;
			setAccountNumber();
		}
		private void setAccountNumber(){
			int random=(int) (Math.random()*100);
			accountNumber=iD + "" + random + SSN.substring(0,2);
			System.out.println("your account no:"+accountNumber);
		}
		public void setName(String name){
			this.name=name;
		}
		public String getName(){
			return name;
		}
		public void payBill(double amount){
			balance=balance-amount;
			System.out.println("paying bill :" +amount);
			showBalance();
		}
		public void makeDeposit(double amount){
			balance=balance+amount;
			System.out.println("making deposit: " +amount);
			showBalance();
		}
		public void showBalance(){
			System.out.println("Balance:"+balance);
		}
		//@override
		public void accrue(){
			balance=balance*(1+rate/100);
			showBalance();
		}
		//@override
		public String toString(){
			return "[Name:" + name +"] \n[Account Number:" +accountNumber + "]\n"+ "[Rounting Number: " +routingNumber + "]\n" +"[Balance "+balance + "]";
			}
		}
	
