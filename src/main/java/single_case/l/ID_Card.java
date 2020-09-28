package single_case.l;

public class ID_Card {
	private static ID_Card id = null;
	private String string_id = null;
	private ID_Card() {
		
	}
	public String getString_id() {
		return string_id;
	}
	public void setString_id(String string_id) {
		this.string_id = string_id;
	}
	public static ID_Card getInstance() {

		if(id == null) {
			id =  new ID_Card();
			id.setString_id("123456");
		}
		return id;
	}
}
