import java.util.Scanner;

class Tile {
	private int eLength;
	public int getTile() {
		return this.eLength;
	}
	
	public void setTile(int length) {
		this.eLength =length;
	}
	public int tileArea() {
		return(this.eLength)*(this.eLength);
	}
}
class floor{
	int fLength;
	int fWidth;
	
	public void totalTiles(Tile t) {
		double sqArea=t.tileArea();
		double flArea = floorArea();
		System.out.println("No of tiles : "+(flArea/sqArea));
		
	}
	void setFloor(int length,int width) {
		this.fLength =length;
		this.fWidth = width;
	}
	public int floorArea() {
		return this.fLength*this.fWidth;
	}
}

public class que42 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter side of square");
		int sq = sc.nextInt();
		
		System.out.println("enter length of rectangle");
		int len = sc.nextInt();
		System.out.println("enter width of rectangle");
		int wid = sc.nextInt();
		
		Tile obj = new Tile();
		obj.setTile(sq);
		
		floor obj1 = new floor();
		obj1.setFloor(len,wid);
		
		obj1.totalTiles(obj);
		sc.close();
	}
}
