package p0717;

public class UserMain2 {

	public static void main(String[] args) {
		User[] ob = new User[3];
		ob[0] = new User("kim","010-1111-1111");
		ob[1] = new User("lee","010-2222-2222");
		ob[2] = new User("park","010-3333-3333");
		
		for(int i=0;i<ob.length;i++) {
			System.out.println(ob[i].getName()+"\t"+ob[i].getPhone());
		}

	}

}
