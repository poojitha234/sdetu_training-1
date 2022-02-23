package junior;
public class StudentApp {
	public static void main(String args[]){
		Student std1=new Student("John","389887767");
		Student std2=new Student("Pooja","253784656");
		Student std3=new Student("Sam","467889035");
		std1.enroll("Java");
		std1.enroll("python");
		std1.enroll("html");
		std1.showCourse();
		std1.checkBalance();
		std1.pay(600);
		std1.checkBalance();
		std1.setphone("9976543278");
		std1.setcity("Nellore");
		std1.setstate("Andhra Pradesh");
		System.out.println(std1.toString());
		}}
	 class Student{
		private  static int iD=1000;
		private String name;
		private String SSN;
		private String emailId;
		private String userId;
		private  static final int cost=800;
		private String phone;
		private String city;
		private String state;
		public int balance=0;
		public String courses="";
		
		public Student(String studname , String SSN ){
		       name=studname;
		       this.SSN=SSN;
		       iD++;
		      // System.out.println(name);
		       //System.out.println(SSN);
		       setuserid();
		       setemail();
		       
		       }
		private void setemail(){
			emailId= name.toLowerCase() +"."+iD+"@sdetuniversity.com" ;
			System.out.println(" your email Id:" +emailId);
			}
		private void setuserid(){
			int max=9000;
			int min=1000;
        int random=(int) (Math.random()*(max-min));
        random=random+min;
       // System.out.println(random);
       // System.out.println(SSN.substring(5));
       // System.out.println(SSN.substring(SSN.length()-4));
         userId= iD +""+ random + SSN.substring(5);
			System.out.println("userid:"+userId);
			}
		public void enroll(String course){
			this.courses=this.courses +"\n"+course;
			balance=balance+cost;
			//System.out.println("select course:"+courses);
			}
		public void pay(int amount){
			System.out.println("payment :" +amount);	
		balance=balance-amount;
		}
		public void checkBalance(){
			System.out.println("Balance:"+balance);
			
			}
		public void showCourse(){
			System.out.println(courses);
		}
		public String toString(){
			
			return "[Name:" + name +"] \n[courses:" +courses + "]\n"+"[balance:"+balance+"]\n"+"[phone:"+phone+"]\n"+"[city:"+city+"]\n"+"[state:"+state+"]";
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



