class que46 {

static class liverpool extends que46 {
	 static void method1(que46 P) {
		if (P instanceof liverpool ) {
			liverpool L = (liverpool)P;
			System.out.println("DownCasting Performed");
		}
	}

	public static void main(String[] args) {
		que46 P = new liverpool();
		liverpool.method1(P);

	}

}
}
