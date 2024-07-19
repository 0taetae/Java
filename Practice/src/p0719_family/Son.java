package p0719_family;

public class Son extends Family implements Job{
	
	
	public Son() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Son(String name) {
		super(name);
	}

	@Override
	public String work() {
		return "\n아들은 공부를 한다\n";
	}
	@Override
	public String toString() {
		return super.toString()+work();
	}
	


	
	
	
}
