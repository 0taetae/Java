package p0725.book;

public class QuantityException extends Exception{
	public QuantityException() {
		super("수량이 부족합니다.");
	}
}
