class oneBHK {
	int roomArea;
	int hallArea;
	static int price;
	
	oneBHK(){
		this.roomArea = 15;
		this.hallArea = 20;
		
		oneBHK.price = 2000;
	}
	oneBHK(int roomArea,int hallArea,int price){
		this.hallArea = hallArea;
		this.roomArea = roomArea;
		oneBHK.price = price;
	}
	void show() {
		System.out.println("RoomArea :"+roomArea);
		System.out.println("HallArea :"+hallArea);
		System.out.println("Price :"+price);
	}
}

class twoBHK extends oneBHK{
	int room2Area;
	static int totalFlat = 0;
	
	twoBHK(){
		this.hallArea=22;
		this.room2Area = 13;
		this.roomArea = 10;
		twoBHK.price = 5000;
	}
	twoBHK(int roomArea,int hallArea,int price,int room2Area ){
		this.hallArea = hallArea;
		this.roomArea = roomArea;
		this.room2Area = room2Area;
		twoBHK.price = price;
		totalFlat = totalFlat + price; 
	}
	void show() {
		System.out.println("RoomArea :"+roomArea);
		System.out.println("HallArea :"+hallArea);
		System.out.println("Price :"+price);
		System.out.println("Room2Area :"+room2Area);
	}
	void totalFlat1() {
		totalFlat = totalFlat + price;
		System.out.println(totalFlat);
	}
	
}
public class que43 {
	public static void main(String[] args) {
	System.out.println("Flat no 1: ");
	twoBHK b1 = new twoBHK(15,21,2544,18);
	b1.show();

	System.out.println("Flat no 2: ");
	twoBHK b2 = new twoBHK(11,25,5544,10);
	b2.show();
	
	System.out.println("Flat no 3: ");
	twoBHK b3 = new twoBHK(15,21,2544,18);
	b3.show();
	
	System.out.println("total amount : ");
	b3.totalFlat1();
	}
}
