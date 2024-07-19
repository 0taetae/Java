package p0719_interface;

public class LazerPrinter implements Printer{

	@Override
	public void print(String fileName) {
		System.out.println("이젠 레이저");
		
	}

}
