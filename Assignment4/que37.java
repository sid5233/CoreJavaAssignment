
class person {
	private String name;
	private int age;
	
	person (){
		this.age = 18;
		System.out.println("Default age : "+age);
	}
	person(int age, String name){
		
		this.age = age;
		this.name = name;
	}
	public void display() {
		System.out.println("name :"+name+ " age : "+age);
	}
}


public class que37 {

	public static void main(String[] args) {
		person obj = new person();
		person obj1 = new person(33,"Cristiano");
		obj1.display();
		
	}

}
