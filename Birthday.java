import java.util.StringTokenizer;

class Birthday {
	public static void main(String[] arguments) {
		StringTokenizer string;

		String birthday = "09/28/1968";

		string = new StringTokenizer(birthday, "/");

		String Month, Day, Year;
		Month = string.nextToken();
		System.out.print (" Month: " + Month);

		Day = string.nextToken();
		System.out.print (" Day: " + Day);

		Year = string.nextToken();
		System.out.print (" Year: " + Year);

	}

}
