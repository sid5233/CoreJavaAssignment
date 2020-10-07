class myThread extends Thread {
	int row;
	
	myThread(int row){
		this.row = row;
	}
	@Override
	public void run() {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.println("* ");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println();
		}
	};
}

public class que61 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
