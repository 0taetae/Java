package p0717;

public class UserMain3 {

	public static void main(String[] args) {
		User[] ob = new User[] {
				new User("kim","010-1111-1111"), 
				new User("kim","010-1111-1111"),
				new User("park","010-3333-3333")};
	for(User m : ob) {
		System.out.println(m.getName()+"\t"+m.getPhone());
	}
		
		

	}

}
