package p0717.emp;

public class EmpScore extends Emp{

	private double score;
	private char grade;
	
	public EmpScore() {
		super();
		
	}
	public EmpScore(String name, String phone, double score, char grade) {
		super(name, phone);
		this.score = score;
		this.grade = grade;
	}
	@Override
	public String toString() {
		return super.toString()+"\n���� ������ "+score+"���̰� ������ "+grade+"�Դϴ�";
	}
	
	
	
	
	

}
