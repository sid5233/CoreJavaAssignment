import java.util.*;

interface studentFee{
	int getFee() throws Exception;
}

class studentChild implements studentFee{
	private int fee;
	public int getFee() throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter fee ");
		fee = sc.nextInt();
		sc.close();
		if (fee <=0 || fee > 100000 )
		{
			throw new Exception ("Invalid fee");
		}
		return fee;
		
	}
}
public class que60 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			studentChild c = new studentChild();
			System.out.println(c.getFee());
		} catch (Exception e) {
			System.out.println(e);
		}
		sc.close();

	}

}
