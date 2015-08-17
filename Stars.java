class Stars {
	public static void main(String[] args) 
		{
			final int MAX_ROWS = 10;
			
			for (int row = 1; row <= MAX_ROWS; row++)
			{
		for (int stars = 1; stars <= row; stars++ )
			System.out.print ("*");
			
		System.out.println();
			}
		}
}
