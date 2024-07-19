package p0719_family;

public class Family {
	private String name;
	

	public Family() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Family(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "이름 : "+name;
	}
	
	
}
