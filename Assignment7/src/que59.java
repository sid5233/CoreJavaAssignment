import java.util.Scanner;

class voter {
	
	private int voterid;
	private String name;
	private int age;
	
	voter(int voterid,String name,int age){
		this.voterid = voterid;
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return "Voter Id : " +voterid+ " Voter Name : \n"+name+" Voter Age :"+age;
	}
}


public class que59 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		try {
			System.out.println("Enter id : ");
			int id=sc.nextInt();
			System.out.println("Enter name :");
			String name=sc.next();
			System.out.println("Enter age : ");
			int age=sc.nextInt();
			if(age<18) {
				throw new Exception("Invalid Age");
			}
			else {
				voter v = new voter(id,name,age);
				System.out.println(v);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
