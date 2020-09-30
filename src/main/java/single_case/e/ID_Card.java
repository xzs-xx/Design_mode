package single_case.e;

public class ID_Card {
	private static ID_Card id = new ID_Card();
	private static String string_id = null;
	private ID_Card() {
		
	}
	public String getString_id() {
		return string_id;
	}
	public void setString_id(String string_id) {
		ID_Card.string_id = string_id;
	}
	public static synchronized ID_Card getInstance() {
		if(string_id == null) {
			string_id = "213134";
		}
		return id;
	}
}
