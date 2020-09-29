package build_case;

public abstract class Burger implements Item {
	 
	@Override
	public Packing packing() {
	   return new Wrapper();
	} 
	@Override
	public abstract float price();
}
