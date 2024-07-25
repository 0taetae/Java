package p0719.interfacee;

public class IronMan implements Heroable{

	@Override
	public void changeShape(boolean isHero) {
		System.out.println("모양 변경");
		
	}

	@Override
	public void fire() {
		System.out.println("탕탕");
		
	}

	@Override
	public void upgrade() {
		System.out.println("짜잔");
		
	}
	
}
