class Nestedloops {
	public static void main (String[] arguments) {

		int T = 0;
	for (int i =1; i < 4; i++){
		for (int j = 1; j < 2*i; j+= 2)
			T += j * i;
			System.out.println("T = " + T);
	
	}
}
}