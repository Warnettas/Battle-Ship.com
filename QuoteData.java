import java.io.*;
import java.net.*;
import java.sql.*;
import java.util.*;

public class QuoteData {
	private String ticker;

	public QuoteData(String inTicker) {
		ticker = inTicker;
	}
	private String retrieveQuote() {
		StringBuilder builder = new StringBuilder();
		try {
			URL page = new URL("http://quote.yahoo.com/d/quotes.csv?s=" +
				ticker + "&f=sl1d1t1c1ohgv&e=csv");
			String line;
			URLConnection conn = page.openConnection();
			conn.connect();
			InputStreamReader in= new InputStreamReader(
					conn.getInputStream());
			BufferedReader data = new BufferedReader(in);
			while ((line = data.readLine()) != null) {
				builder.append(line);
				builder.append("\n");
			}
		} catch (MalformedURLException mue) {
			System.out.println("Bad URL: " + mue.getMessage());
		} catch (IOException ioe) {
			System.out.println("IO Error:" + ioe.getMessage());
		} return builder.toString();
			}
	private void storeQuote(String data) {
		StringTokenizer tokens = new StringTokenizer (data,",");
		String[] fields = new String [9];
		for (int i = 0; i < fields.length; i++) {
			fields[i] = stripQuotes (tokens.nextToken());
		}
		String datasource = "jdbc;derby;derbyDB;create=true";
		try (
			Connection conn = DriverManager.getConnection(
					datasource, "user1", "USER1")
					) {
				)
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
