package p0719_abstract;

// TODO: Vehicle을 상속받는 구조로 변경해보자.
 public class ElectricCar {
    private int curX, curY;

    
    //@Override
    public void addFuel() {
        System.out.printf("차종: %s: 연료 주입: %s%n", this.getClass().getSimpleName(), "충전");
    }
}
