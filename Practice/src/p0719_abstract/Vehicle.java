package p0719_abstract;

public abstract class Vehicle {
	private int curX, curY;
	public void reportPosition() {
        System.out.printf("차종: %s: 현재 위치: (%d, %d)%n", this.getClass().getSimpleName(), curX, curY);
    }
	public abstract void addFuel() ;
		//System.out.println("연료가 필요해");
	
}
