package p0719_abstract;

// TODO: Vehicle을 상속받는 구조로 변경해보자.
 public class DieselSUV {
    private int curX, curY;

    public void addFuel() {
        System.out.printf("차종: %s: 연료 주입: %s%n", this.getClass().getSimpleName(), "경유");
    }
}
