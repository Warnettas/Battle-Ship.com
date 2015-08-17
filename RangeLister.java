class RangeLister {
	int[] makeRanger(int lower, int upper) {
		int [] range = new int [(upper-lower) + 1];
		
		for (int i = 0; i < range.length; i++) {
			range[i] = lower++;
			}
		return range;
	}
	
	public static void main(String[] arguments) {
		int[] range;
		RangeLister lister = new RangeLister() ;
		
		range = lister.makeRanger(4,  13);
		System.out.print("The array: [ ");
		for (int i = 0; i < range.length; i++) {
			System.out.print(range[i] + " ");
		}
		System.out.println("]");
	}

}
