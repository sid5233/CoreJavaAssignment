
public class que47 {

	public que47() {
		this(10);
		System.out.println("Default Constructor Called");
	}
	que47(int x){
		this(5,10);
		System.out.println(x);
	}
	que47(int x, int y){
		System.out.println(x * y );
	}
	
	public static void main(String[] args) {
		new que47();
	}

}
