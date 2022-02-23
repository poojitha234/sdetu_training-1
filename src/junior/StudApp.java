package junior;

public class StudApp {
	public static void main(String args[]){

		Stud std1=new Stud("John","389887767");

		Stud std2=new Stud("Pooja","253784656");

		Stud std3=new Stud("Sam","467889035");

		std1.enroll("Java");

		std1.pay(2000);

		std1.setphone("9976543278");

		std1.setcity("Nellore");

		std1.setstate("Andhra Pradesh");

		System.out.println(std1.toString());

		}}

		class Stud{

		private final static int iD=1000;

		private String name;

		private String SSN;

		private String emailId;

		private String userId;

		private String phone;

		private String city;

		private String state;

		public double balance=5000;

		public String coursename;

		public Stud(String studname , String SSN ){

		       name=studname;

		       this.SSN=SSN;

		       System.out.println(name);

		       System.out.println(SSN);

		       setemail();

		       }

		public void setemail(){

		emailId= name + "@gmail.com" ;

		System.out.println("email Id:" +emailId);

		setuserid();

		}

		public void setuserid(){

		        int random=(int) (Math.random()*10000);

		         userId= iD +""+ random + SSN.substring(5);

		System.out.println("userid:"+userId);

		}

		public void enroll(String course){

		coursename=course;

		System.out.println("select course:"+course);

		}

		public void pay(double amount){

		balance=balance-amount;

		System.out.println("paying bill :" +amount);

		checkBalance();

		}

		public void checkBalance(){

		System.out.println("Balance:"+balance);

		showCourse();

		}

		public void showCourse(){

		System.out.println("enrolled course:"+coursename);

		}

		public String toString(){

		return "[Name:" + name +"] \n[userid:" +userId + "]\n"+"[phone number:"+phone+"]\n"+"[city:"+city+"]\n"+"[state:"+state+"]\n"+ "[course enrolled: " +coursename+ "]\n" +"[Balance "+balance + "]";

		}

		public void setphone(String phone){

		this.phone=phone;

		}

		public String getphone(){

		return phone;

		}

		public void setcity(String city){

		this.city=city;

		}

		public String getcity(){

		return city;

		}

		public void setstate(String state){

		this.state=state;

		}

		public String getstate(){

		return state;

		}

		}


